public class Person {
    int rollno;
}
class personOne{
    String name;
    int age;
    personOne (String name,int age){
        this.name = name;
        this.age = age;
    }
    void display(){
        System.out.println("Name:"+name+"Age:"+age);
    }
}
class personTwo extends personOne{
    //constructor
    personTwo(String name,int age){
       super(name,age);
       this.age=age;
       this.name=name;
    }
}
class main {
    public static void main(String[] args){
    personOne p1=new personOne("Selciya",19);
    }
}
