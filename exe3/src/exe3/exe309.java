package exe3;
import java.util.*;
public class exe309 {

	public static void main(String[] args) {
		System.out.println("ÇëÊäÈë¾ÅÎ»ISBNÂë£º");
		Scanner input = new Scanner(System.in);
		String x = input.next();
		int [] arr=new int[9];
		int sum=0;
		int i=0;
		for(i=0;i<9;i++) {
			String str1=String.valueOf(x.charAt(i));
			arr[i]=Integer.parseInt(str1);
		    sum+=arr[i]*(i+1);
		}
		sum=sum%11;
		if(sum==10) {
			System.out.print("ISBN-10:"+x+"X");
		}
		else {
			System.out.print("ISBN-10:"+x+sum);
	    }
}
}
