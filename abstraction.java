abstract class animal{
    abstract void walk();
    animal(){
        System.out.println("this is a animal constructor");
    }
    public void eat(){
        System.out.println("animal is eating");
    }
}
class horse extends animal{
    horse(){
        System.out.println("this is a horse constructor");
    }
    public void walk(){
        System.out.println("walk on 4 legs");
    }
}
class chicken extends animal{
    public void walk(){
        System.out.println("walks on 2 legs");
    }
}
public class abstraction {
    public static void main(String[] args) {
        horse horse = new horse();
        horse.walk();
//      animal animal = new animal();
//      animal.walk();
        horse.eat();
    }
}
