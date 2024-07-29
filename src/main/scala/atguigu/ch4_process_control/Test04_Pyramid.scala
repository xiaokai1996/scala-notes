package atguigu.ch4_process_control

object Test04_Pyramid {
  def main(args: Array[String]): Unit = {

    for (i <- 1 to 9) {
      val spaces = 9 - i
      val stars = 2 * i - 1
//      println('*' * stars + ' ' * spaces)  this will convert Char to Int and do the math
      println(" " * spaces + "*" * stars)
    }
  }

}
