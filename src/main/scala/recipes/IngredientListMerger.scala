package recipes

object IngredientListMerger {

  def merge(recipes: Seq[RecipeAndMultiples]): Seq[IngredientQuantityWithContributingRecipes] = {
    val ingredientsAndRecipes = recipes.flatMap(recipe => recipe.recipe.ingredients.map(sizedIngredient => {
      val quantity = sizedIngredient.quantity
      val scaledQuantity = Quantity(quantity.numberOfUnits*recipe.multiples, quantity.measurementUnit)
      IngredientQuantityForRecipe(sizedIngredient.copy(quantity = scaledQuantity), recipe.recipe)
    }))
    val ingredientUsages = ingredientsAndRecipes.groupBy(_.sizedIngredient.ingredient).values.toList

    ingredientUsages.flatMap(combineUsagesOfIngredient)
  }

  private def combineUsagesOfIngredient(ingredientsWithRecipes: Seq[IngredientQuantityForRecipe]): Seq[IngredientQuantityWithContributingRecipes] = {

    val reducedToGramsWherePossible = ingredientsWithRecipes.map(getQuantityWithBetterUnit)
    val usagesByMeasurementUnit = reducedToGramsWherePossible.groupBy(_.sizedIngredient.quantity.measurementUnit)
    val unitsToTotal: Map[MeasurementUnit, Double] =
      usagesByMeasurementUnit.mapValues(quantitiesForRecipes => sumQuantities(quantitiesForRecipes))

    val ingredient = ingredientsWithRecipes.head.sizedIngredient.ingredient

    unitsToTotal.map { case (unit, total) =>
      IngredientQuantityWithContributingRecipes(IngredientQuantity(ingredient, Quantity(total, unit)), reducedToGramsWherePossible.map(_.recipe)) }
      .toList
  }

  private def sumQuantities(recipes: Seq[IngredientQuantityForRecipe]) = recipes.map(x => x.sizedIngredient.quantity.numberOfUnits).sum

  private def getQuantityWithBetterUnit(sizedIngredientInRecipe: IngredientQuantityForRecipe): IngredientQuantityForRecipe = {
    val quantity = sizedIngredientInRecipe.sizedIngredient.quantity
    val adjustedQuantity = quantity.measurementUnit.gramsEquivalent match {
      case Some(gramsEquiv) => Quantity(gramsEquiv * quantity.numberOfUnits, MeasurementUnit.g)
      case None => quantity
    }

    val adjustedQuantityMaybeInKg =
      if(adjustedQuantity.measurementUnit==MeasurementUnit.g && adjustedQuantity.numberOfUnits>1000) {
        Quantity(adjustedQuantity.numberOfUnits / 1000, MeasurementUnit.kg)
      } else {
        adjustedQuantity
    }

    val adjustedQuantityMaybeInLitres =
      if(adjustedQuantityMaybeInKg.measurementUnit==MeasurementUnit.ml && adjustedQuantityMaybeInKg.numberOfUnits>1000) {
        Quantity(adjustedQuantityMaybeInKg.numberOfUnits / 1000, MeasurementUnit.litres)
      } else {
        adjustedQuantityMaybeInKg
      }

    val newSizedIngredient = sizedIngredientInRecipe.sizedIngredient.copy(quantity = adjustedQuantityMaybeInLitres)
    sizedIngredientInRecipe.copy( sizedIngredient = newSizedIngredient)

  }




}
