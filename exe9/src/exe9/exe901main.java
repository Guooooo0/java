package exe9;

public class exe901main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Circle circle1=new Circle();
      System.out.print("The area of the circle of radius"
      +circle1.radius+"is"+circle1.getArea()+"\n");
      
      Circle circle2=new Circle(25.0);
      System.out.print("The area of the circle of radius"
    	      +circle2.radius+"is"+circle2.getArea()+"\n");
      
      Circle circle3=new Circle(125.0);
      System.out.print("The area of the circle of radius"
    	      +circle3.radius+"is"+circle3.getArea()+"\n");
      circle2.radius=100.0;
      //circle2.setRadius(100);
      System.out.print("The area of the circle of radius"
    	      +circle2.radius+"is"+circle2.getArea()+"\n");
	}

}
