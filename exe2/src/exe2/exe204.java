
package exe2;
import java.util.Scanner;	
public class exe204 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        final double PI=3.14159;
        Scanner input =new Scanner(System.in);
        double radius =input.nextDouble();
        System.out.print("Enter a number for radius");
        double area=radius*radius*PI;
        System.out.print("The area for the circle of radius "+radius+"is"+area);
        
	}

}
