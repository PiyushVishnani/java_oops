import java.util.*;
public class searching_in_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int size = sc.nextInt();
        int search []= new int[size];

        System.out.println("enter the values of array");
        for(int i=0; i<size; i++){
            search[i]= sc.nextInt();
        }

        System.out.println("enter the value you want to search for");
        int value = sc.nextInt();

        for(int j=0; j<size; j++){
            if(search[j]==value)
                System.out.println(j);
        }
    }
}
