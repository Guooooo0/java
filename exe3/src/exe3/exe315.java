package exe3;
import java.util.*;
public class exe315 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("输入一个三位整数");
		int number=(int)(Math.random()*900+100);
		int x = input.nextInt();
		System.out.println(number);
		int[]a=new int[3];
		int[] b=new int[3];
		a[0]=number% 10;
		a[1]=number/10%10;
		a[2]=number/100;
		b[0]=x% 10;
		b[1]=x/10%10;
		b[2]=x/100;
		int p=0,i,j,flag=1;
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++) {
				if(a[i]==b[j]) {
					a[i]=-1;
					b[i]=-1;
					if(i!=j) {
						flag=0;
					}
				}
			}
		}
		for(i=0;i<3;i++) {
			if(a[i]==-1) {
				p++;
			}
		}
		if(p==3&&flag==1) {
			System.out.print(10000);
		}
		else if(p==3) {
			System.out.print(3000);
		}
		else if(p==1||p==2) {
			System.out.print(1000);
		}
		else {
			System.out.print("没有获奖");
		}
		
	}

}
