package atguigu.ch5_function

object Test08_Practice {
  def main(args: Array[String]): Unit = {

    // a lambda function, use val func = lambda
    val fun1 = (i: Int, s: String, c: Char) => {
      if (i == 0 && s == "" && c == '0') false else true
    }
    println(fun1(0, "", '0'))

    //  error, cannot use val keywords to def function
    //    val fun2(i: Int)(s: String)(c: Char): Boolean = {
    //      if (i==0 && s=="" && c=='0') false else true
    //    }
    //    println(fun1(0)("")('0'))

    // 柯里化
    def fun2(i: Int)(s: String)(c: Char): Boolean = {
      if (i == 0 && s == "" && c == '0') false else true
    }

    println(fun2(0)("")('0'))

    // closure
    def func(i: Int): String => Char => Boolean = {
      // f1 returns another function, and the function return type is still function
      // which makes Char => Boolean
      def f1(s: String): Char => Boolean = {
        def f2(c: Char): Boolean = {
          if (i == 0 && s == "" && c == '0') false else true
        }
        f2
      }
      f1
    }

    println(func(0)("")('0'))


    // simplify the closure, looks elegant but difficult to understand
    def func2(i: Int): String => Char => Boolean = {
      s => c => if (i==0 && s=="" && c=='0') false else true
    }
    println(func2(0)("")('c'))


  }

}
