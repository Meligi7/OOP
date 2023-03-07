
import java.util.*;
public class Main {
    public static void main(String[] args) {

        //Test Program
        Account obj=new Account();
        obj.Setid(1122);
        obj.Setbalance(20000);
        obj.SetannualInterestRate(4.5);
        obj.withdraw(2500);
        obj.deposit(3000);

        System.out.println("Your balance is:"+ obj.getbalance()+"your monthlyInterest is:"+ (obj.getannualInterestRate()/12)*100 +"%" + "Date of creation "+ obj.getDate());


    }}