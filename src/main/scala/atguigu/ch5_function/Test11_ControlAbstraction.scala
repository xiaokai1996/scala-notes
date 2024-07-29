package atguigu.ch5_function

object Test11_ControlAbstraction {
  def main(args: Array[String]): Unit = {
    // 1. 传值参数
    def fun_val(a: Int): Unit = {
      println("a: " + a)
    }

    def f1(): Int = {
      println("f1调用")
      12
    }

    fun_val(23)
    fun_val(f1())

    println("========================")

    // 2. 传名参数，传递的不再是具体的值，而是代码块
//  def fun_val(a: Int): Unit = {
    def fun_fun(a: =>Int): Unit = {
      println("a: " + a)
    }

    fun_fun(f1())
//
//    f2({
//      println("这是一个代码块")
//      29
//    })

  }
}