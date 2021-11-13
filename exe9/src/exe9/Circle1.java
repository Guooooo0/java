package exe9;

public class Circle1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle1 circle1=new Circle1();
	      System.out.print("The area of the circle of radius"
	      +circle1.radius+"is"+circle1.getArea()+"\n");
	      Circle1 circle2=new Circle1(25.0);
	      System.out.print("The area of the circle of radius"
	    	      +circle2.radius+"is"+circle2.getArea()+"\n");
	      
	      Circle1 circle3=new Circle1(125.0);
	      System.out.print("The area of the circle of radius"
	    	      +circle3.radius+"is"+circle3.getArea()+"\n");
	      circle2.radius=100.0;
	      //circle2.setRadius(100);
	      System.out.print("The area of the circle of radius"
	    	      +circle2.radius+"is"+circle2.getArea()+"\n");
	}
	Double radius;
	Circle1() {
		radius=1.0;
	}
	Circle1(Double newRadius){
		radius=newRadius;
	}
	double getArea() {
		return radius*radius*Math.PI;
	}
	double getPerimeter() {
		return 2*radius*Math.PI;   
	}
	void setRadius(double newRadius) {
		radius=newRadius;
	}

}
