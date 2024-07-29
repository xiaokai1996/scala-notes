package atguigu.ch4_process_control

import scala.util.control.Breaks
import scala.util.control.Breaks.{break, breakable}

object Test06_Break {

  def main(args: Array[String]): Unit = {
    // 1. try catch to break
    try {
      for (i <- 1 to 5) {
        if (i % 3 == 0) {
          throw new RuntimeException
        } else {
          println(i)
        }
      }
    } catch {
      case exception: Exception => println("error, and break the for loop")
    }

    // 2. use Scala class: Breaks and its break() method
    Breaks.breakable(
      for (i <- 1 to 5) {
        if (i % 3 == 0) {
          println("import scala.util.control.Breaks")
          println("use Breaks.break() to break the for loop")
          Breaks.break()
        } else {
          println(i)
        }
      }
    )

    breakable(
      for (i <- 1 to 5) {
        if (i % 3 == 0) {
          println("import scala.util.control.Breaks.{break, breakable}")
          println("use break() to break the for loop")
          break()
        } else {
          println(i)
        }
      }
    )

  }

}
