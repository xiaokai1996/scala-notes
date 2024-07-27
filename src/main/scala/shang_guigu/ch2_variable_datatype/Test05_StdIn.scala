package shang_guigu.ch2_variable_datatype

import scala.io.StdIn

object Test05_StdIn {
  def main(args: Array[String]): Unit = {

    // need to import StdIn module

    // 1. readLine()
    println("input name:")
    val name: String = StdIn.readLine()

    // 2. readShort()
    println("input age:")
    val age: Int = StdIn.readInt()

    println("input salary:")
    val salary: Double = StdIn.readDouble()


    println(s"${name}'s age is ${age}, salary is ${salary}'")
  }
}
