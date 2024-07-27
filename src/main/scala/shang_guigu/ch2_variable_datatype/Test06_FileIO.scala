package shang_guigu.ch2_variable_datatype

import java.io.File
import java.io.PrintWriter
import scala.io.Source

object Test06_FileIO {
  def main(args: Array[String]): Unit = {

    // 1. read file and print line
    // foreach like java forEach grammar, receives a lambda function obj
    Source.fromFile("src/main/resources/test.txt").foreach(print)

    // 2. write data into file
    // notes: use java module and java grammar, totally java codes in scala
    val writer = new PrintWriter(new File("src/main/resources/output.txt"))
    writer.write("this is my first output line of scala")
    writer.close()

  }
}
