package exe9;

public class TestCircleWithStaticMembers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Before creating objects");
        System.out.println("The number of Circle objects is"+Circle9.numberOfObjects);
        
        Circle9 c1=new Circle9();
        System.out.println("\nAfter creating c1");
        System.out.println("c1:radius ("+c1.radius+")and number of Circle objects ("+c1.numberOfObjects+")");
        Circle9 c2=new Circle9();
        c1.radius=9.0;
        System.out.println("c2:radius ("+c2.radius+")and number of Circle objects("+c2.numberOfObjects+")");
	}

}
