package shang_guigu.ch5_function

object Test03_FunctionParam {

  def main(args: Array[String]): Unit = {

    // 1.
    println("1. variable params")
    def f1(str: String*): Unit = {
      println(str)
    }
    f1("liukai")
    f1("alice", "bob", "catalina")

    println("\n2. position + variable params")
    def f2(str1: String, str2: String*): Unit = {
      println(str1)
      println(str2)
    }
    f2("alice", "bob", "catalina")

    println("\n3. param has default name")
    def f3(name: String = "eBay"): Unit = {
      println("I work in " + name)
    }
    f3("appen")
    f3()

    println("\n4. default value and position param")
    def f4(name: String = "jack", age: Int): Unit = {
      println(s"${age} year old ${name} is learning scala")
    }
    f4("liukai", 28)
//    f4(10) error
    f4(name = "liukai", 29)
//    f4(29, name="liukai") error, but obey the order
    f4(age=10)
    f4(age=29, name="liukai")
  }

}
