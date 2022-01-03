import java.util.ArrayList;
import java.util.Date;

public class AccountTest11_8 {
	private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;
    private String name;
    ArrayList<TransactionTest11_8> transactions;
    public AccountTest11_8()
    {
        id=0;
        balance=0;
        annualInterestRate=0;
        dateCreated=new Date();
        transactions=new ArrayList<TransactionTest11_8>();
    }
    public AccountTest11_8(int di,double b)
    {
        id=di;
        balance=b;
        annualInterestRate=0;
        dateCreated=new Date();
        transactions=new ArrayList<TransactionTest11_8>();
    }
    public AccountTest11_8(int di,double b,String n)
    {
        id=di;
        balance=b;
        annualInterestRate=0;
        dateCreated=new Date();
        name=n;
        transactions=new ArrayList<TransactionTest11_8>();
    }
    public int getId(){
        return id;
    }
    public void setId(int j){
        id=j;
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double j){
        balance=j;
    }
    public double getAnnualInterestRate(){
        return annualInterestRate;
    }
    public void setAnnualInterestRate(double j){
        annualInterestRate=j;
    }
    public Date getDateCreated(){
        return dateCreated;
    }
    public double getMonthlyInterestRate()
    {
        return annualInterestRate/12;
    }
    public double getMonthlyInterest(){
        return annualInterestRate/12*balance;
    }
    public void withDraw(double m,String ass){
        balance-=m;
        transactions.add(new TransactionTest11_8('W',m,balance,ass));
    }
    public void deposit(double m,String ass){
        balance+=m;
        transactions.add(new TransactionTest11_8('D',m,balance,ass));
    }
    public void setName(String n){
        name=n;
    }
    public String getName(){
        return name;
    }

}
