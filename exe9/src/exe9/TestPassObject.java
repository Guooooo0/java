package exe9;

public class TestPassObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Circle8 mycircle=new Circle8(1.0);
       int n=5;
       printAreas(mycircle,n);
       System.out.println("\n"+"Radius is "+mycircle.getArea());
       System.out.println("n is"+n);
	}
	public static void printAreas(Circle8 c,int times) {
		System.out.println("Radius \t\tArea");
		while(times>=1) { 
			System.out.println(c.getRadius()+"\t\t"+c.getArea());
			c.setRadius(c.getRadius()-1);
			times--;
		}
	}

}
