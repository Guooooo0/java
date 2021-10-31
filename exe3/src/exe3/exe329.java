package exe3;
import java.util.*;
public class exe329 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input=new Scanner(System.in);
        System.out.println("Enter circle1's center x-, y-coordinates, and radius:");
        double x1=input.nextDouble();
        double y1=input.nextDouble();
        double r1=input.nextDouble();
        System.out.println("Enter circle1's center x-, y-coordinates, and radius:");
        double x2=input.nextDouble();
        double y2=input.nextDouble();
        double r2=input.nextDouble();
        if((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2)>(r1+r2)*(r1+r2)) {
        	System.out.println("circle2 does not overlap circle1");
        }
        else if((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2)<=(r1-r2)*(r1-r2)) {
        	System.out.println("circle2 is inside circle1");
        }
        else {
        	System.out.println("circle2 overlap circle1");
        }
	}

}
