package exe3;
import java.util.*;
public class exe328 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input=new Scanner(System.in);
        System.out.println("Enter r1's center x-, y-coordinates, width, and height:");
        double x1=input.nextDouble();
        double y1=input.nextDouble();
        double w1=input.nextDouble();
        double h1=input.nextDouble();
        System.out.println("Enter r1's center x-, y-coordinates, width, and height:");
        double x2=input.nextDouble();
        double y2=input.nextDouble();
        double w2=input.nextDouble();
        double h2=input.nextDouble();
        if(Math.abs(x1-x2)+w2/2<=w1/2 &Math.abs(y1-y2)+h2/2<=h1/2 ) {
        	System.out.println("r2 is inside r1");
        }
        else if(Math.abs(x1-x2)>(w1+w2)/2&Math.abs(y1-y2)>(h1+h2)/2) {
        	System.out.println("r2 does not overlap r1");
        }
        else {
        	System.out.println("r2 overlap r1");
        }
	}

}
