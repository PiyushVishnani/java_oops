public class tower_of_hanoi {
    public static void towerOfHanoi(int n, String src, String helper, String dest){
        if(n==1){
            System.out.println("tranfer disk "+ n + " fron "+src+" to "+dest);
            return;
        }
        towerOfHanoi(n-1,src,dest,helper);
        System.out.println("trannfer disk "+ n + " fron "+src+" to "+dest);
        towerOfHanoi(n-1,helper,src,dest);

    }
    public static void main(String[] args) {
        int n = 3;
        towerOfHanoi(n,"S","H","D");
    }
}
