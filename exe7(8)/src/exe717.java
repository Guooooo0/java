import java.util.Scanner;
public class exe717 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        int [] score=new int[num];
        String [] names=new String[num];
	    for(int i=0;i<num;i++) {
	    	System.out.println("请输入第"+(i+1)+"学生姓名");
	        names[i]=input.next();
	    	System.out.println("请输入第"+(i+1+"学生成绩"));
	        score[i]=input.nextInt();
	    }
	    
	    for(int i=0;i<num-1;i++) {
	    	for(int j=0;j<num-i-1;j++) {
	    		if(score[j]<score[i]) {
	    			 int temp = score[j];
	                    score[j] = score[j+1];
	                    score[j+1] = temp;
	 
	                    String name = names[j];
	                    names[j] = names[j+1];
	                    names[j+1] = name;

	    		}
	    	}
	    }
	    for (int i = 0;i<num;i++){
            System.out.println("第"+(i+1)+"名\t"+names[i]+"\t"+score[i]+"分");
	}
}
}
