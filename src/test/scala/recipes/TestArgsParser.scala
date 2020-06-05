package recipes

import org.scalatest.FlatSpec
import org.scalatest.Matchers._


class TestArgsParser extends FlatSpec {

  "The args parser" should "parse single recipes" in {
    ArgsParser.parseArgument("curry:5") should equal(RecipeNameAndMultiples("curry",5))
  }

  it should "parse recipe multiples" in {
      ArgsParser.parseArgument("curry") should equal(RecipeNameAndMultiples("curry",1))
  }

}
