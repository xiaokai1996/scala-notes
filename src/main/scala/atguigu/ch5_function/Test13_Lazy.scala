package atguigu.ch5_function

object Test13_Lazy {
  def main(args: Array[String]): Unit = {


    val add = (a: Int, b: Int) => {
      println("start to sum")
      a + b
    }
    val res = add(1,2)
    println("calculating...")
    println(s"res=${res}")


    println("\nwhat if using lazy mode?")

    // if lazy mode, the function will not execute until get the result
    lazy val res2 = add(1, 2)
    println("calculating...")
    println(s"res2=${res2}")

  }

}