package exe5;
import java.util.*;
public class exe521 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input=new Scanner(System.in);
    	System.out.println("请输入贷款的总额度和贷款期限");
    	int num =input.nextInt();
    	int year =input.nextInt(); 
    	double yearrate =0.05,monthPayment,totalPayment;
    	System.out.println("InterestRate   Month Payment      Total Payment");
    	for(yearrate=0.05;yearrate<=0.08;yearrate+=0.00125)
    	{
    		double monthrate=yearrate/12;
    		monthPayment =(num*monthrate)/(1-1/Math.pow(1+monthrate,year*12)); 
    		totalPayment =monthPayment*12*year;;
    		System.out.printf("%7f%13.2f%21.2f\n",yearrate,monthPayment,totalPayment);
    	}
    	
	}

}
