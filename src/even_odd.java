import java.util.*;
public class even_odd {
    public static void main(String[] args) {
        System.out.println("Emter the number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num%2==0){
            System.out.println("the number is even");
        }
        else{
            System.out.println("the number is odd");
        }
    }
}
