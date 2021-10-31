package exe5;
import java.util.Scanner;
public class exe517 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n =input.nextInt();
		int i,j;
		for(i=1;i<=n;i++) {
			for(j=n;j>=1;j--) {
				if(i>=j) {
					System.out.print(j);
				}
				else {
					System.out.print(" ");
				}
			}
			for(j=1;j<=n;j++) {
				if(j<i) {
					System.out.print(j+1);
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
