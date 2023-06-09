import java.util.Scanner;
public class calculate_percentage {
    public static void main(String agrs[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the marks in all 5 subjects");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        float d = sc.nextFloat();
        float e = sc.nextFloat();
        System.out.println("enter the maximum marks of the exam");
        float f = sc.nextFloat();
        float total= f*5;
        float sum = a+b+c+d+e;
        float cgpa= sum/total;
        float percent=(sum/total)*100;
        System.out.println("percentage of the student is "+ percent);
    }
}
