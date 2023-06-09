import java.util.*;
public class array {
    public static void main(String[] args) {
       /* int[] marks = new int[3];
        marks[0] = 98;
        marks[1] = 99;
        marks[2] = 97;

        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);*/

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of an array");
        int size = sc.nextInt();
        int marks[] = new int[size];

        //taking input of the values of array from user
        System.out.println("enter the values of array");
        for(int i=0; i<size; i++){
            marks[i] = sc.nextInt();
        }

        //printing values of an array using for loop
        System.out.println("the values of array are");
        for(int i=0; i<size; i++){
            System.out.println(marks[i]);
        }
    }
}
