package shang_guigu.ch4_process_control

object Test05_WhileLoop {

  def main(args: Array[String]): Unit = {

    // while
    var a: Int = 10
    while (a >= 1) {
      print(s"$a -> ")
      a -= 1
    }
    println(a)

    // do while
    var b: Int = 1
    var sum: Int = 0
    do {
      sum += b
      b += 1
    } while (b <= 100)
    println(sum)


  }

}
