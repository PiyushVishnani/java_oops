class pen{
    String color;
    String type;

    public void write(){
        System.out.println("writing something");
    }
    public void printColor(){
        System.out.println(this.color);
    }
}
class student{
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    student(String name, int age){
        this.name = name;
        this.age = age;
    }
}
public class oops {
    public static void main(String[] args) {
        pen pen1 = new pen();
        pen1.color = "red";
        pen1.type = "ballpoint";
        pen1.write();

        pen pen2 = new pen();
        pen2.color = "black";
        pen1.printColor();
        pen2.printColor();

        student s1 = new student("piyush",19);
        s1.printInfo();
    }
}
