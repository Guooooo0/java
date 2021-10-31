package exe5;
import java.util.*;
public class exe522 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input =new Scanner(System.in);
        System.out.print("Enter Loan Amount£º  ");
		double loan=input.nextDouble();
		System.out.print("Enter Number of Years :   ");
		int years=input.nextInt();
		System.out.print("Enter Annual Interest Rate £º ");
		double rate=input.nextDouble();
		double mon_rate=rate/1200.0;
		double interest,interest1,principal,balance=loan,Total_Payment=0 ;
		int i=1;
		double mon_payment=(loan*mon_rate*Math.pow(1+mon_rate,years*12)/(Math.pow(1+mon_rate,years*12)-1));
		System.out.printf("Monthly Payment £º%.2f ",mon_payment);
		System.out.println();
		for(i=1;i<=years*12;i++) 
		{
		interest1=mon_rate*balance;
		Total_Payment+=interest1;
		}
		
		System.out.println("Total Payment  £º "+(Total_Payment+loan));
		System.out.println("payment#"+"\t"+"Interest"+"\t"+"Principal"+"\t"+"Balance");
		
		for(i=1;i<=years*12;i++) 
		{
			interest=mon_rate*balance;
			principal=mon_payment-interest;
			balance=balance-principal;
			System.out.printf("%d\t\t%.2f\t\t%.2f \t\t%.2f\n",i,interest,principal,balance);
		}
	}

}
