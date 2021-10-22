import java.util.Scanner;
public class exe705 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input=new Scanner(System.in);
		int [] a=new int [11];
		int [] b=new int [11];
        System.out.println("输入十个数:");
		for(int i=0;i<10;i++) {
			a[i]=input.nextInt();
        }
		int t=0,f;
        for(int i=1;i<10;i++) {
        	b[0]=a[0];
        	f=1;
        	for(int j=0;j<10;j++) {        		
        		if(a[i]==b[j]) {
        			f=0;
        		}	
        	}
        	if(f==1) {
        		t++;
        		b[t]=a[i];
        	}
        }
        System.out.println("The number of distinct number is "+t);
        System.out.print("The distinct number are:");
        for(int i=0;i<=t;i++) {
        	System.out.print(b[i]+" ");
        }
	}

}
