public class pattern_print {
    public static void main(String[] args) {
        /*for(int i=1;i<=5;i++){
            for(int j=1; j<=4; j++){
                System.out.print("*");
            }
            System.out.println();
        }*/
        /*for(int i=1;i<=5;i++){
            for(int j=1; j<=4; j++){
                if(i==1 || i==5 || j==1 || j==4)
                System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }*/
       /* for(int i=1;i<=5;i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();*/
        /*for(int i=5; i>=1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }*/
        /*int n=4;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }*/
         /*for(int i=1; i<=5; i++){
             for(int j=1; j<=i; j++){
                 System.out.print(j);
             }
             System.out.println(" ");
         }*/
        int number=1;
        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                System.out.print(number+" ");
                number++;
            }
            System.out.println(" ");
        }
    }
}
