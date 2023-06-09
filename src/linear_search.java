/*
Name:Piyush Vishnani
Section:J
University Roll no.:201500471
BTech(CS) 3rd year
class roll no.:43
*/
import java.util.*;
public class linear_search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {10,20,5,7,2,45};
        System.out.println("enter the number you want to search for");
        int x = sc.nextInt();
        for(int i = 0; i<arr.length; i++){
            if(arr[i]==x)
                System.out.println("your element is found at index "+ i);
            if(i>=arr.length)
                System.out.println("your element is not there");
        }
    }
}
