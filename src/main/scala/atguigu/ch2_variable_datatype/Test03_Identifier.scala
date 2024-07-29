package atguigu.ch2_variable_datatype

object Test03_Identifier {

  def main(args: Array[String]): Unit = {
    // 1. like java naming style
    val hello: String = ""
    var Hello123 = ""
    val _hello = 123

    // 2. special: starts with + - * / % # ! operator, and only contains operator
    // +hello is invalid
    val +-*/%#?! = "hello, i am +-*/%#?!"
    println(+-*/%#?!)

    // 3. use `...` back quota to include any string, even scala key words
    val `if` = "if"
    println(`if`)
  }

}
