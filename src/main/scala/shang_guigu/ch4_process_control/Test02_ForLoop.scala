package shang_guigu.ch4_process_control

object Test02_ForLoop {
  def main(args: Array[String]): Unit = {

    // 1. range travel
    for (i <- 0 to 10) {
      println(s"${i} loop, hello liukai")
    }

    // this is very like python range()
    for (i <- 0 until 10) {
      println(s"${i} loop, hello liukai")
    }

    // 2. traverse collections
    println("\n2. traverse collections")
    for (ele <- Array(1, 2, 3)) {println(ele)}
    for (ele <- List(1, 2, 3)) {println(ele)}
    for (ele <- Set(1, 2, 3)) {println(ele)}

    // 3. loop guard, pretty like python: range(1, 10) if i%2!=0
    println("\n3. loop guard")
    for (i <- 1 until 10 if i%2 != 0 ) {
      println(i)
    }

    // 4. loop with steps, pretty like python: range(1, 10, 2)
    println("\n4. loop with steps")

    println("normal order")
    for (i <- 1 until 10 by 2) {
      print(i)
    }

    println("\nreverse order")
    for (i <- 10 until 0 by -1) {
      print(i)
    }

    // it seems that reverse keywords does not work
//    println("\ndirectly use reverse keywords")
//    for (i <- 10 until 10 reverse){
//      print(i)
//    }

    // it seems that fraction does not work either
//    for (data <- 1.0 to 10.0 by 0.3){
//      println(data)
//    }

    // 5. loop in loop
    println("\nmultiply table")
    for (i <- 1 to 9) {
      for (j <- 1 to i) {
        print(s"\t${i}*${j}=${i*j}")
      }
      println
    }

    // 6. loop and import var
    // but i feel this typing is not elegant, even a little bit confusing
    for {
      i <- 1 to 10
      j = i * i
    } {
      // totally can move `j = i * i` here to this brace {}
      println(i, j)
    }

    // 7. yield
    val seq = for (i <- 1 to 10) yield i * i
    println(seq)  // get a Vector data type: Vector(1, 4, 9, 16, 25, 36, 49, 64, 81, 100)


  }
}
