public class Student {
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static String name;
    public int age;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


    public static String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }
}