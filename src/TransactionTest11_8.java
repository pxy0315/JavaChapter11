import java.util.Date;

public class TransactionTest11_8 {
	public Date date;
    public char type;
    public double amount;
    public double balance;
    public String description;
    public TransactionTest11_8(char t,double am,double bl,String des){
        date=new Date();
        type=t;
        amount=am;
        balance=bl;
        description=des;
    }

}
