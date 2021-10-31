package exe3;
import java.util.*;
public class exe323 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input=new Scanner(System.in);
        System.out.println("请输入一个点的横纵坐标");
	    double x=input.nextDouble();
	    double y=input.nextDouble();
	    if(Math.abs(x)<5 &Math.abs(y) <2.5) {
            System.out.printf("Point (%.1f,%.1f) is in the retangle",x,y);	    	
	    }
	    else {
	    	System.out.printf("Point (%.1f,%.1f) is not in the retangle",x,y);
	    }
	}

}
