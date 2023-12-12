package BankingSystems.kama;

public interface Banks {

    public int repoRate=5;

    public String addMoney(int money);

    public String checkBalance(String password);
    public String withdraw(String password,int money);


    public double getInterestMoney(int years);
}
