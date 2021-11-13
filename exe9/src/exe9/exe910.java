package exe9;
import java.util.*;
public class exe910 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input=new Scanner(System.in);
		double a=input.nextDouble();
		double b=input.nextDouble();
		double c=input.nextDouble();
		QuadraticEquation object=new QuadraticEquation(a,b,c);
		if(object.getDiscriminant()>0)
			System.out.println(object.getRoot1()+object.getRoot2());
		else if(object.getDiscriminant()==0)
			System.out.println(object.getRoot1());
		else
			System.out.println("The equation has no roots.");
	}

}
