package shang_guigu.ch1

// 伴生类，可以访问伴生对象里面的方法
// 在编译之后，伴生类会变成Student.class
class Student (name: String, age: Int){
  def printInfo(): Unit = {
    // 注意name和age是对象本身的，而school是伴生对象的
    println(name + age + Student.school)
  }
}

// 引入伴生对象,把全局对象放到这里
// 在编译之后，伴生对象会变成Student$.class（有dollar符）
object Student {
  val school: String = "atguigu"

  def main(args: Array[String]): Unit = {
    val liukai = new Student("liukai", 28)
    val xiaoyan = new Student("xiaoyan", 26)
    liukai.printInfo()
    xiaoyan.printInfo()
  }
}

/*Java的思路是用static，把类的属性、方法，和对象的属性、方法分隔开
* Scala的思路是用class和object伴生对象，把类和对象区分开
* */