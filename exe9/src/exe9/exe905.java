package exe9;
import java.util.*;
public class exe905 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         GregorianCalendar data=new GregorianCalendar();
         System.out.println(data.get(GregorianCalendar.YEAR));
         System.out.println(data.get(GregorianCalendar.MONTH)+1);
         System.out.println(data.get(GregorianCalendar.DAY_OF_MONTH));
         data.setTimeInMillis(1234567898765L);
         System.out.println(data.get(GregorianCalendar.YEAR));
         System.out.println(data.get(GregorianCalendar.MONTH));
         System.out.println(data.get(GregorianCalendar.DAY_OF_MONTH));
	}

}
