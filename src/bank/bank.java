package bank;
class account{
    public String name;
    protected String email;
    private String password;
    // getters and setters are used for private
    public String getPassword(){
        return this.password;
    }
    public String setPassword(){
        this.password = "pass";
        return null;
    }
}
public class bank {
    public static void main(String[] args) {
        account account1 = new account();
        account1.name = "piyush";
        account1.email = "piyush vishnani";
//        account1.setPassword("abcd");
        System.out.println(account1.getPassword());

    }
}
