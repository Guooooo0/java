package exe5;
import java.util.*;
public class exe532 {

	public static void main(String[] args) {
		int a =(int)(Math.random()*9+1);
		int b =(int)(Math.random()*9+1);
	    while(a==b) {
	    	b=(int)(Math.random()*9+1);
	    }
	    	int t=a*10+b;
	    	System.out.print(t);
	}

}
