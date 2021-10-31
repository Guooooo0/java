package exe3;
import java.util.*;
public class exe322 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input=new Scanner(System.in);
        System.out.println("请输入一个点的横纵坐标");
       int x=input.nextInt();
       int y=input.nextInt();
       if(x*x+y*y<100) {
    	   System.out.println("点在圆内");
       }
       else {
    	   System.out.println("点在圆外");
       }
        
	}

}
