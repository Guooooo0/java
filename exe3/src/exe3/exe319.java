package exe3;
import java.util.*;
public class exe319 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("�����������������ߵĳ��ȣ�");
	    int a =input.nextInt();
	    int b =input.nextInt();
	    int c= input.nextInt();
	    if(a+b>c&&a+c>b&&b+c>a) {
	    	System.out.print(a+b+c);
	    }
	    else {
	    	System.out.print("����ֵ���Ϸ�");
	    }
	}

}
