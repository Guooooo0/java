package exe9;
import java.util.*;
public class Data {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
        for(long i = 10000; i <= 1e10;i=i*10) {
            date.setTime(i);
            System.out.println(date.toString());
        }
	}

}
