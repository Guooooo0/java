package exe5;
import java.util.*;
public class exe545 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner input =new Scanner(System.in);
         double [] arr=new double[11];
         int t=0;
         int p=0;
         for (int i=0;i<10;i++) {
        	  arr[i]=input.nextInt();
              t+=arr[i];
              p+=Math.pow(arr[i],2);
         }
         double meam=t/10;
         System.out.printf("The meam is %.2f \n",meam);
	     double k=Math.sqrt((p-t*t/10)/9);
	     System.out.printf("The standard deviation is %.5f\n",meam);
	     
	}

}
