import java.util.*;

class shape{
    public void area(){
        System.out.println("displays area");
    }
}
class triangle extends shape{
    public void area(int l, int h){
        System.out.println(1/2*l*h);
    }
}
class equilateralTriangle extends triangle {
    public void area(int l, int h){
        System.out.println(1/2*l*h);
    }
}
public class inheritance {
    public static void main(String[] args) {
        triangle t1 = new triangle();
        t1.area(20,10);
//        bank.account account1 = new bank.account();
//        account1.name = "customer1";
    }
}
