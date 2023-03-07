import java.text.DateFormat;
import java.util.*;
public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private DateFormat dateCreated;
    public Account(){

    }
    public Account(int id,double balance){
        this.id=id;
        this.balance=balance;
    }
    public int Getid(){
        return id;
    }
    public double getbalance(){
        return this.balance;
    }
    public double getannualInterestRate(){
        return this.annualInterestRate;
    }
    public void Setid(int id){
        this.id=id;
    }
    public void Setbalance(double balance){
        this.balance=balance;
    }
    public void SetannualInterestRate(double annualInterestRate){
        this.annualInterestRate=annualInterestRate;
    }
    public DateFormat getDate(){
        return this.dateCreated;
    }
    public void setDate(){
        this.dateCreated=dateCreated;
    }
    public double GetMonthlyInterstRate(){
        return (getannualInterestRate()/12)/100;
    }
    public double getMonthlyInterst(){
        return (getannualInterestRate())*this.balance;
    }
    public double withdraw(double amount){
        return this.balance-amount;
    }
    public double deposit(double amount){
       return this.balance+amount;
    }
}
