package shang_guigu.ch5_function

object Test01_FunctionAndMethod {

  def main(args: Array[String]): Unit = {

    def sayHi(name: String): Unit = {
      println("hi in function " + name)
    }

    // by default, scala call method inside the main function
    sayHi("liukai")

    // need to specify Class.method to call function defined out
    Test01_FunctionAndMethod.sayHi("liukai")

  }

  def sayHi(name: String): Unit = {
    println("hi " + name)
  }

}
