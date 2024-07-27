package shang_guigu.ch2_variable_datatype

object Test04_String {
  def main(args: Array[String]): Unit = {

    // use + to concat string, like java
    val alice: String = "alice"
    val age: Int = 25
    println(age + " years old " + alice)

    // multiply, like python
    println(alice * 5)

    // print format, like c, but % and data type is tedious
    printf("%d years old %s\n", age, alice)

    // string template, like python print(f"val={val}"), but grammar style is more like unix shell
    println(s"${age} years old ${alice}")

    // default decimals is Double type
    println("formated template string")
    val num: Double = 123.456
    println(s"the num is ${num}")
    println(f"the num is ${num}%2.2f")  // like c grammar
    println(raw"the num is ${num}%2.2f")  // like regex grammar

    // triple quotation mark, output multiple lines of string and keep raw format
    // like python grammar
    val sql: String =
      s"""
         |select *
         |  from student
         | where name = ${alice}
         |   and age > ${age}
         |""".stripMargin
    println(sql)
  }

}
