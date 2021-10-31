package exe5;
import java.util.*;
public class exe528 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input =new Scanner (System.in);
        System.out.println("输入年份和代表该年第一天是周几的数字:");
        int y=input.nextInt();
        int d=input.nextInt();
        String str = "";
        String str2 = "";
        int day=0;
        for (int m = 1; m <= 12 ; m++){
            switch (m){
                case 1: {day += 31; str += "January 1, ";} 
                     break;
                case 2: {day += 28; str += "Febrary 1, ";} 
                     break;
                case 3: {day += 31; str += "March 1, ";}
                     break;
                case 4: {day += 30; str += "April 1, ";}
                     break;
                case 5: {day += 31; str += "May 1, ";} 
                      break;
                case 6: {day += 30; str += "June 1, ";}
                      break;
                case 7: {day += 31; str += "July 1, ";} 
                      break;
                case 8: {day += 31; str += "August 1, ";}
                      break;
                case 9: {day += 30; str += "September 1, ";} 
                      break;
                case 10: {day += 31; str += "November 1, ";} 
                      break;
                case 11: {day += 30; str += "October 1, ";}
                      break;
                case 12: {day += 31; str += "December 1, ";}
                      break;
	        } 
            if (((y % 4 == 0) && (y % 100 != 0)) || ((y % 400 == 0) && (y % 100 == 0))){
                  if (m>1) {
                   day +=1;
                  }
            }
            int t=d%7;
            switch(t) {
            case 1:
            	str2=" is Monday";
            	break;
            case 2:
            	str2=" is Tuesday";
                break;
            case 3:
            	str2=" is Wednesday";
                break;
            case 4:
            	str2=" is Thurday";
                break;
            case 5:
            	str2=" is Friday";
                break;
            case 6:
            	str2=" is Saturday";
                break;
            case 0:
            	str2=" is Sunday";
                break;
            }
       System.out.println(str+y+str2);
       str="";
       str2="" ;    
       }
}
}