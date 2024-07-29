package com{

  import com.liukai.scala.Inner

  // def a singleton object in the outer side package
  object Outer{
    var out: String = "out"

    def main(args: Array[String]): Unit = {
      println(Inner.in)
    }
  }

  // def package1
  package liukai{
    package scala {
      // def a singleton object
      object Inner {
        var in: String = "in"

        def main(args: Array[String]): Unit = {
          println(Outer.out)
          Outer.out = "package1 outer"
          println(Outer.out)
        }
      }
    }
  }

  // def package2
  package liuliu{
    package kaikai{
      object liukai{
        def main(args: Array[String]): Unit = {
          import com.liukai.scala.Inner
          println("in package2 " + Inner.in)
        }
      }
    }
  }

}