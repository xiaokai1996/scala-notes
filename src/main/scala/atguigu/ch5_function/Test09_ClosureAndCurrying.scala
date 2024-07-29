package atguigu.ch5_function

object Test09_ClosureAndCurrying {

  def main(args: Array[String]): Unit = {

    // 1. def a closure
    def addByA(a: Int):Int => Int = {
      def addB(b: Int): Int = {
        a + b
      }
      addB
    }

    println(addByA(10)(20))
//    println(addByA(10, 20))

    val f = addByA(10)
    println(f(25))

    // 2. use lambda to simplify
    println("\nuse lambda to simplify closure")
    def addByA1(a: Int):Int => Int = {
      (b: Int) => a + b
    }

    def addByA2(a: Int): Int => Int = (b) => a + b
    println(addByA1(1)(2))
    println(addByA1(3)(4))

    // 3. currying
    println("\nuse currying to simplify closure")
    def addCurrying(a: Int)(b: Int): Int = a + b
    println(addCurrying(12)(34))



  }

}
