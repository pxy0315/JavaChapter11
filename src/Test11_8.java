//ÐÂµÄAccountÀà
public class Test11_8 {

	public static void main(String[] args) {
		AccountTest11_8 ass = new AccountTest11_8(1122,1000,"George");
        ass.deposit(30,"1st dep");
        ass.deposit(40,"2nd dep");
        ass.deposit(50,"3rd dep");
        ass.withDraw(5,"1st wdw");
        ass.withDraw(4,"2nd wdw");
        ass.withDraw(2,"3rd wdw");
        System.out.print("name :"+ass.getName()+" rate: "+ass.getAnnualInterestRate()+" balance: "+ass.getBalance()+"\n");
        for(TransactionTest11_8 dick:ass.transactions) {
            System.out.println("date: "+dick.date);
            System.out.println("type: " + dick.type);
            System.out.println("amount: "+dick.amount);
            System.out.println("new balance: "+dick.balance);
            System.out.println("description: "+dick.description);
        }

	}

}
