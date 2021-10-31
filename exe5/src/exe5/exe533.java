package exe5;
import java.util.*;
public class exe533 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        for(int i=2;i<=10000;i++) {
        	int t=0;
        	for(int j=1;j<i;j++) {
        		if(i%j==0) {
        			t+=j;
        		}
        	}
        	if(t==i) {
        		System.out.printf("%d ",i);
        	}
        }
	}

}

