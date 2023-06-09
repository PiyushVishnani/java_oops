import java.util.*;
public class methods_in_java {
    //getting input a string from user and printing it
    /*public static void printMyName(String name){
        System.out.println(name);
        return;
    }*/
    public static int sum(int a, int b){
        int sum = a+b;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      //  String name = sc.next();

      //  printMyName(name);   //function call !!

        //function to add two numbers and return its sum
        System.out.println("enter the two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = sum(a, b);
        System.out.println("sum of those two numbers is:" + sum);
    }
}
