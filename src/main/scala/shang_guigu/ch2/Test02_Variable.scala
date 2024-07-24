package shang_guigu.ch2

import shang_guigu.ch1.Student

/*
var表示变量
val表示常量
能用val常量表示的，就优先使用常量，这个更加的函数式编程
scala更像python，先写对象名，再写类型
 */
object Test02_Variable {
  def main(args: Array[String]): Unit = {
    var a: Int = 10
    val b: Int = 20

    // 1. 类型可以自动推导
    var a1 = 10
    var b1 =23

    // 2. 类型一旦确定，不能再更改

    // 3. val对象不能重复赋值

    // 4. 必须有初始值

    // 5. 引用变量不能修改！但是对象里面的数值，如果构造函数的变量是var的话可以修改
    var liukai = new Student("liukai", 28)
    liukai = new Student("liukai", 29)
    liukai.printInfo()

    val xiaoyan = new Student("xiaoyan", 26)
//    xiaoyan = new Student() // 会报错

    // 如果Student类的age是val，就会报错，如果是var，就可以赋值
    xiaoyan.age = 27
    xiaoyan.printInfo()

  }
}
