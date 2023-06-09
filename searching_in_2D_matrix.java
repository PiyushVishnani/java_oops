import java.util.*;
public class searching_in_2D_matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of rows");
        int rows = sc.nextInt();
        System.out.println("enter number of columns");
        int cols = sc.nextInt();
        int[][] numbers = new int[rows][cols];

        System.out.println("enter the values of 2D array");
        for (int i=0; i<rows; i++) {
            for (int j=0; j<cols; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }
        System.out.println("enter the number you want to search for");
        int num = sc.nextInt();

        for (int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(num==numbers[i][j]){
                    System.out.println("indices of the number is " + i+","+j);
                }
            }
        }
    }
}
