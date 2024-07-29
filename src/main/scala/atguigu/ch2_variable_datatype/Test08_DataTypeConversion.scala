package atguigu.ch2_variable_datatype

object Test08_DataTypeConversion {
  def main(args: Array[String]): Unit = {

    // 1. auto lifting to large range precision data type
    val a1: Byte = 10
    val b1: Long = 99999L
    val c1: Long = a1 + b1
    val c2: Short = (a1 + b1).toShort

    // 2. cast type
    val n1: Int = 2.9.toInt
    println(n1)

    val n2: Int = 2.6.toInt + 3.7.toInt
    val n3: Int = (2.6 + 3.7).toInt
    println("n2: " + n2)
    println("n3: " + n3)

    // 3. cast between string and number
    // a. number to string
    val n: Int = 27
    println(n + " ")

    // b. string to number
    // println("123.345".toInt) // will throw error
    // string -> Double -> Int
    println("123.345".toDouble.toInt)

    // @TODO: why???
    println("extension interview question")
    var num: Int = 130
    // 00000000 00000000 00000000 10000010
    // 10000010 only keep last 8 bits
    // 1 -> negative, 0000010 -> 1111101(125) + 1 -> -126
    var bnum: Byte = num.toByte
    println(bnum)

  }

}
