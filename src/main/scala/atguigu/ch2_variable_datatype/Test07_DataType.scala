package atguigu.ch2_variable_datatype

import atguigu.ch1_basics.Student

// this part is very important !!!
object Test07_DataType {
  def main(args: Array[String]): Unit = {

    // 1. Integer Type: Byte, Short, Int, Long
    // Byte: 8bits(-2^7~2^8-1,-128~127), Short: 16bits, Int: 32bits, Long: 64bits
    // how to remember, byte: about 250, short: about 250*250(6.25W), Int: 6.25*6.25W(42Y)
    val a1: Byte = -128
    val a2: Byte = 127  // 128 will automatically convert to Int

    val a3: Short = 30000

    val a4: Int = 60000
    val a5: Long = 99999999999999999L   // Long num must ends with L


    // 2. Floating Num: Float, Double
    val f1: Float = 1.345f              // Float num must ends with f
    val f2: Double = 3.1415926

    // 3. Character Type: Char
    var c1: Char = 'a'    // single quotation mark = Char, double quotation mark = String
    var c2: Char = '9'
    var c3: Char = '\t'   // Escape Character
    var c4: Char = '\n'
    var c5: Char = '\\'
    var c6: Char = '\"'
    println(c1 + c2 + c3 + c4 + c5 + c6)  // print an Int num !

    val c7 = (c1 + 1).toChar
    println(c7)

    // 4. Boolean
    println("boolean test")
    val isTrue: Boolean = true
    println(isTrue)

    // 5. Empty Data Tytpe

    // a. Unit, unit has an instance value: () a bracket
    println("\n5.a test Unit type")
    def method1(): Unit = {println("func1 is executed")}
    val m1: Unit = method1()
    println("m1:" + m1)

    // b. nothing
    // notes: val cannot be an input param cos it is scala key words
    println("\n5.b nothing")
    def method2(n: Int): Int = {
      if (n == 0)
        throw new NullPointerException
      else
        return n
    }
    val b = method2(2)
    println(b)

    def method3(): Nothing = {
      println("executing method3, return Nothing")
      throw new Exception()
    }
    method3

    // c. Null Reference: Null
    // null can only be set to reference object
    println("\n5.c null reference")
    var student = new Student("alice", 20)
    student = null
    println(student)



  }

}
