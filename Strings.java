import java.util.*;
public class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter you name");
        String name = sc.nextLine();
        System.out.println("your name is " + name);

        //concatenation
        String firstName = "Tony";
        String lastName = "Stark";
        String fullName = firstName +  " " + lastName;
        System.out.println(fullName);

        //length function
        System.out.println(fullName.length());

        //charAt
        for(int i=0; i<fullName.length(); i++){
            System.out.println(fullName.charAt(i));
        }

        //comparing 2 strings
        if(fullName.compareTo(lastName)==0){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are not equal");
        }

        //substring
        String sentence = "my name is tony";
        String substring = sentence.substring(11,sentence.length());
        System.out.println(substring);
    }
}
