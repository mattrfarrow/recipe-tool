package recipes

object ArgsParser {

  def parseArgument(arg: String): RecipeNameAndMultiples = {
    val elements = arg.split(':')
    if(elements.isEmpty) {
      throw new RuntimeException("Error parsing param string, found no elements in: "+arg)
    }
    if(elements.length==1) {
      return RecipeNameAndMultiples(elements.head, 1)
    }
    if(elements.length==2) {
      return RecipeNameAndMultiples(elements.head, elements(1).toInt)
    }
    throw new RuntimeException("Error parsing param string: "+arg)
  }
}
