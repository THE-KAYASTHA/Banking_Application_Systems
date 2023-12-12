package BankingSystems.kama;

public class AxisBank implements Banks{

    public int accountNo;

    public String accountName;

    private String password;

    private double balance;

    public double minBalance;

    public static final double rateOfInterest = 8.5;

    public AxisBank(String accountName, String secretCode, double balance) { //getter
        //Account no : generate a random and store it
        this.accountName = accountName;
        this.password = secretCode;
        this.balance = balance;
        minBalance = 5000.0;
    }


    public String addMoney(int money)
    {
        balance=balance+money;
        return "Final balance is"+balance;
    }

    public String checkBalance(String password)
    {
        if(password.equals(this.password)){

            return "Current balance is "+balance;
        }
        else{
            return "Password is Wrong";
        }
    }

    public String withdraw(String password, int money)
    {
        if(password.equals(this.password)){
            if(money+minBalance<=balance){
                balance=balance-money;

                return "Money withdrawn successfully. Final balance is"+balance;
            }
            else{
                return "Your account has not sufficient balance";
            }

        }
        else{
            return "Your account has not sufficient balance";

        }
    }

    public double getInterestMoney(int years) {

        double totalInterest = (years*balance*rateOfInterest)/100;
        return totalInterest;

    }
}
