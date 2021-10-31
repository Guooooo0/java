package exe3;
import java.util.*;
public class exe327 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a point's x- and y-coordinates:");
     	double x = input.nextDouble();
		double y = input.nextDouble();
		if(y<=-0.5*x+100&&x>=0&&y>=0) {
			System.out.println("The point is in the triangle");
		}else {
			System.out.println("The point is not in the triangle");
		}
	}

}
