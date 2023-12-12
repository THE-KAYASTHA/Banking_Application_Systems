package BankingSystems.kama;
import java.util.*;
public class Main{
    public static void main(String args[]){

        Scanner in =new Scanner(System.in);
        System.out.print("Enter your name");
        String name=in.next();
        System.out.print("Enter your password");
        String password=in.next();
        System.out.print("Enter your initial balance");
        int balance=in.nextInt();
        Banks acc1=new AxisBank(name,password,balance);
        System.out.print("Kamal account has been created");

        System.out.print("Enter your first deposit");
        int addMoney=in.nextInt();
        String result=acc1.addMoney(addMoney);
        System.out.print(result);
        System.out.print("Enter your password");
        password=in.next();
        result =acc1.checkBalance(password);
        System.out.print(result);

        System.out.println("Enter the money you want to withdraw !!");
        addMoney = in.nextInt();
        System.out.println("Enter the password !!");
        password = in.next();
        result = acc1.withdraw(password,addMoney);
        System.out.println(result);


        System.out.println("Enter the years");
        int years=in.nextInt();
        double interest=acc1.getInterestMoney(years);
        System.out.println("Interest for "+years+" is"+interest);
    }


}
