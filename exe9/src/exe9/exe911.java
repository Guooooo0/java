package exe9;
import java.util.*;
public class exe911 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input =new Scanner (System.in);
        double a=input.nextDouble();
		double b=input.nextDouble();
		double c=input.nextDouble();
		double d=input.nextDouble();
		double e=input.nextDouble();
		double f=input.nextDouble();
		LinearEquation object=new LinearEquation(a,b,c,d,e,f);
		if(object.isSolvable()) {
			System.out.println("X:"+object.getX()+"Y"+object.getY());
		}
		else
			System.out.println("The equation has no solution");
	}

}
