object Exercises {


  def reverse[T](seq: Seq[T]): Seq[T] = if (seq.nonEmpty) reverse(seq.tail) :+ seq.head
  else Nil

  /**
   * https://ru.wikipedia.org/wiki/Числа_Фибоначчи
   *
   * @param idx Индекс элемента
   * @return
   */
  def fibonacci4Index(idx: Int): Int = if (idx == 1 || idx == 2) 1
  else fibonacci4Index(idx-1) + fibonacci4Index(idx-2)

  def fibonacci(idx: Int): Seq[Int] = if (idx == 1) Seq(0) :+ fibonacci4Index(idx)
  else fibonacci(idx-1) :+ fibonacci4Index(idx)

  lazy val MORSE = Map("A" -> ".-", "B" -> "-...", "C" -> "-.-.", "D" -> "-..", "E" -> ".", "F" -> "..-.",
                       "G" -> "--.", "H" -> "....", "I" -> "..", "J" -> ".---", "K" -> "-.-", "L" -> ".-..",
                       "M" -> "--", "N" -> "-.", "O" -> "---", "P" -> ".--.", "Q" -> "--.-", "R" -> ".-.",
                       "S" -> "...", "T" -> "-", "U" -> "..-", "V" -> "...-", "W" -> ".--", "X" -> "-..-",
                       "Y" -> "-.--", "Z" -> "--..")

  def morse(text: String): String = if (text.nonEmpty && text.head.isLetter) (MORSE(text.toUpperCase().head.toString) + " " + morse(text.tail))
  else if (text.nonEmpty) text.head + morse(text.tail)
  else ""


  def wordReverse(text: String): String = {
      var textReverse = ""
      var word = ""
      var smallCase = true
      for (ch <- text.toCharArray) {
          if (ch.isLetter) {
              if (word.length == 0 && ch.toUpper == ch) smallCase = false
              word += ch.toLower
          } else {
              if (word.length > 0) {
                  if (smallCase) {
                    textReverse += word.reverse
                  } else {
                      textReverse += word.charAt(word.length-1).toUpper
                      textReverse += word.reverse.substring(1)
                  }
              }

              textReverse += ch
              word = ""
              smallCase = true
          }
      }

    textReverse
  }

}
