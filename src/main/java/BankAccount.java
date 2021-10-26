public class BankAccount {
    // Instance variables
    private int balance;
    private int accountNumber;
    private String preferredName;
    //constructor
    public BankAccount(int b, int a, String p){
        balance = b;
        accountNumber = a;
        preferredName = p;
    }
    public void withdraw(int x){
        if(x>accountNumber){
            System.out.println("you don't have that much money");
        }
        else{
            accountNumber -= x;
            System.out.println("your new account is" + accountNumber);
        }
    }
    public void deposit(int x){
        accountNumber += x;
        System.out.println("you now have" + accountNumber + "in your back account");
    }
    public int getAccountNumber(){
        return accountNumber;
    }
    public String getPreferredName(){
        return preferredName;
    }
    public void setPreferredName(String name){
        this.preferredName = name;
    }
    public String toString(){
        return "your account number is" + accountNumber + "and your balance is " + balance + ".";
    }
}