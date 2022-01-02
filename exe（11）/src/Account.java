import java.util.*;
public class Account {
	private String name;
    private int id=0;
    private double balance=0;
    private double Rate=0;
    private Date date;
    ArrayList<Transaction> transactions;
    public Account(){
        date=new Date();
        transactions=new ArrayList<Transaction>();
    }
    public Account(int id,double b){
    	this.id=id;
        this.balance=b;
    	date=new Date();
        transactions=new ArrayList<Transaction>();
    }
    public Account(int id,double b,String n){
    	this.id=id;
        this.balance=b;
    	date=new Date();
        name=n;
        transactions=new ArrayList<Transaction>();
    }
    public Account(int id,double b,String n,double rate){
        this.id=id;
        this.balance=b;
        this.Rate=rate;
        date=new Date();
        name=n;
        transactions=new ArrayList<Transaction>();
    }
    public void setName(String n){
         name=n;
     }
    public String getName(){
         return name;
     }
     public int getId(){
         return id;
     }
     public void setId(int id){
         this.id=id;
      }
     public double getBalance(){
         return balance;
      }
     public void setBalance(double ba){
         this.balance=ba;
     }
     public double getRate(){
         return Rate;
     }
     public void setRate(double ra){
         this.Rate=ra;
     }
     public void withdraw(double m,String n){
         balance-=m;
         Transaction p = new Transaction('W',m,balance,n);
         transactions.add(p);
     }
     public void deposit(double m,String n){
         balance+=m;
         Transaction p = new Transaction('D',m,balance,n);
         transactions.add(p);
     }
}

