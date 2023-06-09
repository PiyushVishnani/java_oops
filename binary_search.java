/*
Name:Piyush Vishnani
Section:J
University Roll no.:201500471
BTech(CS) 3rd year
class roll no.:43
*/
import java.util.*;
public class binary_search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number you want to search for");
        int x = sc.nextInt();
        int[] arr = {10,20,5,7,2,45};
        Arrays.sort(arr);
        int first = 0;
        int last = arr.length-1;
        int mid = (first+last)/2;
        while(first<=last){
            if ( arr[mid] < x ){
                first = mid + 1;
            }else if ( arr[mid] == x ){
                System.out.println("Element is found at index: " + mid);
                break;
            }else{
                //the key is to be searched in the second half of the array
                last = mid - 1;
            }
            mid = (first + last)/2;
        }
        if(first>last){
            System.out.println("element is not found");
        }
    }
}
