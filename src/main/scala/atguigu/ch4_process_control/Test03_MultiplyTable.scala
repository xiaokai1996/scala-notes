package atguigu.ch4_process_control

object Test03_MultiplyTable {
  def main(args: Array[String]): Unit = {

    // 1. normal way
    for (i <- 1 to 9) {
      for (j <- 1 to i) {
        print(s"${i}*${j}=${i * j}\t")
      }
      println()
    }

    // 2. simplify writing style
    println("use a simpler way to represent:")
    for (i <- 1 to 9; j <- 1 to i) {
      print(s"$i*$j=${i * j}\t")
      if (i == j) println()
    }
  }
}
