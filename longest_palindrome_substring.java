public class longest_palindrome_substring {
        public static String longestPalindrome(String s) {
            int len = s.length();
            if(len == 1){
                return s;
            }
            int l=len/2-1;
            int r=len/2;
            //even length
            // if(len%2==0){
            //     for(int i=0;i<=len/2;i++){
            //         if(s.CharAt(l)==s.charAt(r)){
            //             l--;r++;
            //         }
            //     }
            // }
            //odd length
            if(len%2!=0){
                l=len/2;
                r=len/2;
                for(int i=0;i<=len/2+1;i++){
                    if(s.charAt(l)==s.charAt(r)){
                        l--;r++;
                    }
                }
            }
            return s.substring(l,r+1);
        }
        public static void main(String args[]){
            System.out.print(longestPalindrome("aba"));
        }
}
