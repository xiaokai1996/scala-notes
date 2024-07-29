package atguigu.ch5_function

object Test05_Lambda {
  def main(args: Array[String]): Unit = {

    val fun = (name: String) => {
      println(name)
    }
    fun("liukai")

    def f(func: String => Unit): Unit = {
      func("liukai")
    }

    f(fun)

    def dualFunction(fun: (Int, Int) => Int): Int = {
      fun(1, 2)
    }

    val add = (a: Int, b: Int) => {
      a + b
    }
    val minus = (a: Int, b: Int) => {
      a - b
    }

    println(dualFunction(add))
    println(dualFunction(minus))

    def operation(arr: Array[Int], op: Int => Int) = {
      for (ele <- arr) yield op(ele)
    }

    def add1(ele: Int) = {ele + 1}

    val arr = operation(Array(1, 2, 3, 4), add1)
    println(arr.mkString(","))

    val arr2 = operation(Array(1, 2, 3, 4), _ - 1)
    println(arr2.mkString(","))


    def calc(a: Int, b:Int, op: (Int, Int) => (Int)): Int = {op(a, b)}

    println(calc(1, 2, (a, b) => {a*b}))
    println(calc(1, 2, (a, b) => {a+b}))
    println(calc(1, 2, (a, b) => {a-b}))

    def fun1(a: Int, b: String, c: Char): Boolean = {
      if (a==0 && b=="" && c=='0') {
        return false
      } else {
        return true
      }
    }
    

  }
}
