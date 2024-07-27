package shang_guigu.ch4_process_control

import scala.io.StdIn

object Test01_IfElse {
  def main(args: Array[String]): Unit = {
    println("input age:")
    val age: Int = StdIn.readInt()

    // 1. multi branch
    if (age <= 6) {
      println("child")
    } else if (age < 18) {
      println("teenager")
    } else if(age < 60) {
      println("adult")
    } else {
      println("elder")
    }

    // 2. multi branch return value
    val res: Any = if (age <=6) {
      "child"
    } else if (age < 19) {
      "teenager"
    } else {
      "adult"
    }
    println(s"you are ${res} according to your input age")

    // 3. java String res = (age > 18) ? "adult" : "teenager"
    val res2: String = if (age > 18) {"adult"} else {"teenager"}
    println(res2)
  }

}
