package exe5;

public class exe507 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int i,n=10000,total4=10000;
        for(i=1;i<10;i++) {
        	n=105*n/100;
        	if(i<4) {
        		total4+=n;
        	}
        }
        System.out.println(n);
        System.out.println(total4);
	}

}
