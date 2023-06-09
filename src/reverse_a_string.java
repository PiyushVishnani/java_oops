public class reverse_a_string {
    public static void printRev(String str, int idx){
        if(idx==0){
            System.out.print(str.charAt(idx)+ " ");
            return;
        }
        System.out.print(str.charAt(idx)+" ");
        printRev(str,idx-1);
    }
    public static void main(String[] args) {
        //using iteration
//        StringBuilder sb = new StringBuilder("hello");
//        System.out.println(sb);
//
//        for(int i=0; i<sb.length()/2; i++){
//            int front =i;
//            int back = sb.length()-1-i;
//
//            char frontchar = sb.charAt(front);
//            char backchar = sb.charAt(back);
//
//            sb.setCharAt(front,backchar);
//            sb.setCharAt(back,frontchar);
//        }
//        System.out.println(sb);

        //using recursion
        String str = "abcd";
        printRev(str,str.length()-1);

    }
}
