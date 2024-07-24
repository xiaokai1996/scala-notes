// Java是如何定义成员变量和静态变量的
public class Student {
    private String name;
    private Integer age;

    // 如果学校都是一样的,那这就是一个全局对象
    private static String school = "atguigu";

    // 此时的构造方法是不需要填入school这个字段的，因为这个字段属于类本身
    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    // 提供一个对外接口
    // 这里school不是通过this去获取的，因为school不是定义在对象里的，而是在类里面
    public void getInfo() {
        System.out.println(this.name + this.age + Student.school);
    }


    public static void main(String[] args) {
        Student liukai = new Student("liukai", 29);
        Student xiaoyan = new Student("xiaoyan", 26);
        liukai.getInfo();
        xiaoyan.getInfo();
    }
}
