package exe5;
import java.util.*;
public class exe527 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input=new Scanner(System.in);
        int t=0;
        for(int i=101;i<=2100;i++) {
        	if(i%4==0&i%100!=0||i%400==0) {
        		System.out.printf("%d ",i);
        		t++;
        	}
        	if(t%10==0) {
        		System.out.println();
        	}
        }
	}

}
