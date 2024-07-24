package shang_guigu.ch1

//object定义了一个单例的对象，全局只有一个，并且是一个伴生对象
//问题，scala是OOM的，对象都是从类new出来的，那这个对象到底是哪个类的对象呢？
object HelloScala {

  // def 函数名(参数：参数类型)：返回值 = {方法体}
  def main(args: Array[String]): Unit = {
    println("hello scala")
    System.out.println("hello scala, but i use java grammar")
  }

}
