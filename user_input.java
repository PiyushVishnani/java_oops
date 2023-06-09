import java.util.Scanner;
public class user_input {
    public static void main(String args[]){
        System.out.println("taking input fron the user!!");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the two numbers");
        int a= sc.nextInt();
        int b= sc.nextInt();
        int sum = a+b;
        System.out.println("sum of those two numbers is "+ sum);
    }
}
