package exe5;
import java.util.*;
public class exe525 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        double pi=0;
        int k=1;
        for(int i=1;i<=n;i++) {
           pi=pi+1.0/(i*2-1)*k;	
           k=-k;
        }
        pi=pi*4;
        System.out.println(pi);
	}

}
