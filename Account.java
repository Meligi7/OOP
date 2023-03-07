import java.text.DateFormat;

public class Account {

    private int id;
    private double balance;
    private double annualInterestRate;
    private DateFormat dateCreated;

   public int Getid(){
       return id;
   }
   public void Setid(int newid){
       this.id=newid;
   }
    public double Getbalance(){
        return balance;
    }
    public void Setbalance(double newbalance){
        this.balance=newbalance;
    }
    public double GetannualInterstRate(){
        return annualInterestRate;
    }
    public void SetannualInterstRate(double newannualInterestRate){
        this.annualInterestRate=newannualInterestRate;
    }
    public DateFormat newdateCreated(){
        return dateCreated ;
    }
    public void SetdateCreated(DateFormat newdatacreated){
        this.dateCreated=newdatacreated;
    }
    public Account(){

    }
    public Account(int id,int balance){
        this.id=id;
        this.balance=balance;
    }

    public double getMonthlyInterestRate(){
        return (GetannualInterstRate()/12)/100;
    }
    public double getMonthlyInterest(){
        return getMonthlyInterestRate()*balance;
    }
    public double Withdraw(double x){
        return balance-x;
    }
    public double deposit(double x){
        return balance+x;
    }
}
