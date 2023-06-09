import java.util.*;
public class factorial {
    //calculating factorial of a number by using for loop
//    public static void factorial(int x){
//        if (x<0){
//            System.out.println("invalid number");
//            return;
//        }
//        int fact = 1;
//        for(int i=x;i>=1;i--){
//            fact = fact*i;
//        }
//        System.out.println(fact);
//        return;
//    }


    //calculating factorial by recursion
    public static int factorial(int n){
        if(n==1 || n==0)
            return 1;
        int fact_of_nm1 = factorial(n-1);  //fact_of_nm1=fact_of_n-1
        int fact = n*fact_of_nm1;
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number for which you want to calculate its factorial");
        int n = sc.nextInt();
        int x = factorial(n);
        System.out.println(x);

    }
}
