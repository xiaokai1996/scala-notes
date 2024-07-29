package atguigu.ch5_function

object Test10_Recursion {

  def main(args: Array[String]): Unit = {
    println(fact(5))
  }

  // fact
  def fact(n: Int): Int = {
    if (n == 1) 1 else n * fact(n - 1)
  }

}
