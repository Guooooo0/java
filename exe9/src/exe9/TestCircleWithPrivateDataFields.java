package exe9;

public class TestCircleWithPrivateDataFields {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Circle8 mycircle =new Circle8(5.0);
        System.out.println("The area of the circle of radius"+mycircle.getRadius()+"is"+mycircle.getArea());	
        mycircle.setRadius(mycircle.getArea()*1.1);
        System.out.println("The area of the circle of radius"+mycircle.getArea());
	    System.out.println("The number of objects created is"+mycircle.getNumberOfObjects());
	    }

}
