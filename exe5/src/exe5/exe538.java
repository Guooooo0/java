package exe5;
import java.util.*;
public class exe538 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input=new Scanner(System.in);
        System.out.println("请输入一个十进制整数：");
        int x=input.nextInt();
        int [] t=new int[101];
        int k=0;
        while(x>0) {
        	t[k]=x%8;
        	k++;
        	x=x/8;
        }
        for(int i=k-1;i>=0;i--) {
        	System.out.print(t[i]);
        }
}
}
