import java.util.*;
public class recursion {
    public static void nNanuralSum(int i, int n, int sum ){
        if(i==n){
            sum +=1;
            System.out.println("the sum of first "+n+" terms is");
            System.out.println(sum);
            return;
        }
        sum+=i;
        nNanuralSum(i+1,n,sum);
    }

    public static void printNumner(int n){
        if(n==0)
            return;
        System.out.print(n+" ");
        printNumner(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        printNumner(n);
        nNanuralSum(1,n,0);
    }
}


















