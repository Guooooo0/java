import java.util.ArrayList;
import java.util.Date;
public class testAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Account account1=new Account(1122,1000,"George",1.5);
        account1.deposit(30, "1d");
        account1.deposit(40, "2d");
        account1.deposit(50, "3d");
        account1.withdraw(5, "1w");
        account1.withdraw(4, "2w");
        account1.withdraw(2, "3w");
        System.out.print("name:" +account1.getName()+" rate: "+account1.getRate()+" balance: "+account1.getBalance());
        for(Transaction num:account1.transactions) {
            System.out.println("date: "+num.date);
            System.out.println("type: " + num.type);
            System.out.println("amount: "+num.amount);
            System.out.println("new balance: "+num.balance);
            System.out.println("description: "+num.description);
        }
	}

}
