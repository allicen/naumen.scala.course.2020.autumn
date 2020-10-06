package example

object Main extends App {
  val firstName = "Elena"
  val secondName = "Rubleva"
  var firstNameReverse: String = firstName.reverse
  var secondNameReverse: String = secondName.reverse

  var hello = s"Hello Scala! This is ${firstName}"
  printLine(hello)

  var resReplace: String = hello.replace("Hello", "Hola")
  printLine(resReplace)

  var resReplaceTwo: String = hello.replace("Hello", "Privet")
  printLine(resReplaceTwo)


  val firstLine: String = resReplace.replace("Elena", firstNameReverse) + secondNameReverse
  printLine(firstLine)

  val secondLine: String = resReplaceTwo.replace("Elena", firstNameReverse) + " " + secondNameReverse
  printLine(secondLine)

  def printLine(line: String) {
    println(line)
  }
}
