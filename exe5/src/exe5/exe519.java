package exe5;
import java.util.*;;
public class exe519 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner input =new Scanner(System.in);
        int n=input.nextInt();
        int t=1;
         for(int i=1;i<=n;i++){ 
			for(int j=1;j<=n-i;j++){
				System.out.print("   ");
			}
		    for(int j=1;j<=i;j++){
			    System.out.printf("%3d",t);
                t=t*2;		    
		    }
		    t=t/2;
		    for(int j=i-1;j>=1;j--){
		    	t=t/2;
			    System.out.printf("%3d",t);
		    }
		System.out.println();
	}
}
}
