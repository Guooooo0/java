package exe9;

public class Circle9 {
	double radius;
	static int numberOfObjects=0;
	Circle9(){
		radius=1;
		numberOfObjects++;
	}
	Circle9(double newRadius){
		radius=newRadius;
		numberOfObjects++;
	}
	static int getNumberOfObjects() {
		return numberOfObjects;
	}
	double getArea() {
		return radius*radius*Math.PI;
	}
}
