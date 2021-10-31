package exe3;
import java.util.*;
public class exe324 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input=new Scanner(System.in);
        Random r = new Random();
	    int  num=r.nextInt(13)+1;
	    int color=r.nextInt(4)+1;
	    System.out.print("The card you picked is ");
	    if(num==1) {
			System.out.print("Ace");
		}else if(num==11) {
			System.out.print("Jack");
		}else if(num==12) {
			System.out.print("Queen");
		}else if(num==13) {
			System.out.print("King");
		}else {
		System.out.print(num);
		}
		System.out.print(" of ");	
		if(color == 0) {
			System.out.print("Clubs");		
		}else if(color == 1) {
		System.out.print("Diamonds");
		}else if(color == 2) {
			System.out.print("Hearts");
		}else {
			System.out.print("Spades");
		}
	}
}
