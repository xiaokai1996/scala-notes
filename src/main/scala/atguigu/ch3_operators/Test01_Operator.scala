package atguigu.ch3_operators

object Test01_Operator {
  def main(args: Array[String]): Unit = {

    // 1. default divide evenly
    val res1: Int = 10 / 3
    println(res1)

    val res2: Double = 10/3
    println(res2)

    val res3: Double = 10/3
    println(res3.formatted("%5.2f"))  // this way is deprecated
    println("%5.2f".format(res3))

    // 2. compare operator
    val s1: String = "hello"
    val s2: String = new String("hello")

    /*
     this is a huge difference from Java,
     == in java  compares memory address, but
     == in scala compares value of the object
     */
    println(s1 == s2) // @TODO why is equal???
    println(s1.equals(s2))
    println(s1.eq(s2))


    println("end")

    // judge if a string is empty or not
    def isNotEmpty(str: String): Boolean = {
      return str != null && str.trim != ""
    }
    println(isNotEmpty(null))
    println(isNotEmpty("  a"))

    var a: Int = 0
    // a ++ // like python, there is no ++ operator in scala
    a += 1

    /*
     Understand the essence of scala operator, there is actually no operator in Scala
     all operators are methods of certain object!
     This is also why we can use operator as a variable or function name !
     For example, you can press `Ctrl` and click the operator to view the implementation !
     */
    var b = a.+ (a)
    println(1.234.toInt)

    println(1.34.*(25))
    println(1.34 * 25)



  }



}
