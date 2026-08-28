public class Student {
    String name;
    int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class Main {
    public static void main(String[] args) {
        Student obj = new Student();  // ✅ Correct class name
        obj.setName("Bobby");
        obj.setAge(19);

        System.out.println("Student Name: " + obj.getName());
        System.out.println("Student Age: " + obj.getAge());
    }
}
