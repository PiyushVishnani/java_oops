import java.util.*;
public class bubble_sort {
    public static void printArray(int arr[]){
       for(int i=0;i<arr.length;i++){
           System.out.print(arr[i]+" ");
       }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {7,2,5,10,9,20};

        //bubble sort
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        printArray(arr);
    }
}
