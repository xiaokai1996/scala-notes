package shang_guigu.ch5_function

object Test01_FunctionAndMethod2 {

  def main(): Unit = {
  }

  def main(args: Array[String]): Unit = {

    // can import module anywhere
    import java.util.Date
    new Date()

    def test(): Unit ={
      println("无参，无返回值")
    }
    test()

    // 函数没有重载和覆盖的概念，所以会报错
//    def test(name:String):Unit={
//      println()
//    }

    def test1(): Unit = {
      def test2(): Unit = {
        println("function in function")
      }
    }

  }


}
