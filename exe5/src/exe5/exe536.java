package exe5;

import java.util.Scanner;

public class exe536 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�������λISBN�룺");
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
