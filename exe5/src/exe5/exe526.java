package exe5;
import java.util.*;
public class exe526 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        double e=0;
        for(int i=n;i>=1;i--) {
           e=(e+1.0)/i;
        }
        e++;
        System.out.println(e);
	}

}
