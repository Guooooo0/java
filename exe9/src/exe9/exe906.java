package exe9;

import java.util.Random;

public class exe906 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        stopwatch time=new stopwatch();
        Random random= new Random(1000);
        int [] a =new int[10000];
        for (int i=0;i<10000;i++) {
        	a[i]=random.nextInt(1000);
        }
        Sort(a);
        time.end(time.getElapsedTime());
        System.out.println(time.getEndTime()-time.getStartTime());
	}
public static void Sort(int[] list) {
		for(int i=0;i<list.length-1;i++){
			int currentMax=list[i];
			int currentMaxIndex=i;
			for(int j=i+1;j<list.length;j++){
				if(currentMax<list[j]){
					currentMax=list[j];
					currentMaxIndex=j;
				}
			}
			if(currentMaxIndex !=i){
				list[currentMaxIndex]=list[i];
				list[i]=currentMax;
			}
		}
		for(int i1=0; i1<list.length; i1++) {
			System.out.print(" "+list[i1]);
		}
}
}




