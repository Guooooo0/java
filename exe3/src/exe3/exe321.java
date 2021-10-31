package exe3;
import java.util.*;
public class exe321 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("输入年份：");
		int y=input.nextInt();
		System.out.println("输入月份：");
		int m=input.nextInt();
		System.out.println("输入	该月的几号：");
		int q=input.nextInt();
		if(m<3) {
			y=y-1;
			m=m+12;
		}
		int j=y/100;
		int k=y%100;
		int h=(q+26*(m+1)/10+k+k/4+j/4+5*j)%7;
		if(h==0) {
			System.out.println("Day of the week is Saturday");	
		}else if (h==1) {
			System.out.println("Day of the week is Sunday");	
		}else if (h==2) {
			System.out.println("Day of the week is Monday");	
		}else if (h==3) {
			System.out.println("Day of the week is Tuesday");	
		}else if (h==4) {
			System.out.println("Day of the week is Wednesday");	
		}else if (h==5) {
			System.out.println("Day of the week is Thursday");	
		}else if (h==6) {
			System.out.println("Day of the week is Friday");	
		}
				
	}

}
