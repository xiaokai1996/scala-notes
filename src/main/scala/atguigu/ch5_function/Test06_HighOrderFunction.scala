package atguigu.ch5_function

import scala.collection.mutable.ArrayBuffer

object Test06_HighOrderFunction {

  def main(args: Array[String]): Unit = {

    def map(arr: Array[Int], op: (Int) => Int): Array[Int] = {
      for (ele <- arr) yield op(ele)
    }
    println(map(Array(1, 2, 3, 4, 5), x => x*x).mkString(","))


    def filter(arr: Array[Int], op: Int => Boolean): ArrayBuffer[Int] = {
      val res: ArrayBuffer[Int] = ArrayBuffer[Int]()
      for (ele <- arr if op(ele)) res.append(ele)
      res
    }
    println(filter(Array(1, 2, 3, 4, 5), x => x%2 == 0).mkString(","))


    def reduce(arr: Array[Int], op: (Int, Int)=> Int): Int = {
      var res: Int = arr(0)
      for (i <- 1 until arr.length) {
        res = op(res, arr(i))
      }
      res
    }
    println(reduce(Array(1, 2, 3, 4, 5), (x, y) => x + y))
    println(reduce(Array(1, 2, 3, 4, 5), (x, y) => x * y))

  }

}
