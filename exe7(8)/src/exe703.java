import java.util.Scanner;
public class exe703 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input =new Scanner(System.in);
        int [] num=new int[101];
        int [] b=new int[101];
        for(int i=0;i<101;i++) {
        	num[i]=input.nextInt();
            if(num[i]==0) {
            	break;
            }
        }
        for(int i=0;i<101;i++) {
        	b[i]=0;
        }
        for(int i=0;i<101;i++) {
            b[num[i]]++;	
        }
        for(int j=1;j<101;j++) {
        	if(b[j]!=0) {
        		System.out.println(j+"occurs"+b[j]+"times");
        	}
        }
        
	}

}
