package figureEnglish;
import java.util.Scanner;

public class FigureEnglish {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        
        System.out.println(translateEng(input));
        
    }
    
    // 数値を英訳する変換するメソッド
    static String translateEng(int n) {
    	String s="";
    	int nlast = n%10;
    	if(n/10==1) {
    		if(n==10) s+="ten";
    	    else if(n==11) s+="eleven";
    	    else if(n==12) s+="twelve";
    	    else if(n==13) s+="thirteen";
    	    else if(n==14) s+="fourteen";
    	    else if(n==15) s+="fifteen";
    	    else if(n==16) s+="sixteen";
    	    else if(n==17) s+="seventeen";
    	    else if(n==18) s+="eighteen";
    	    else if(n==19) s+="nineteen";
    	}
    	else if(n/10!=1) {
    		int n10 = n/10;
    		if(n10==2) s+="twenty ";
    		else if(n10==3) s+="thirty ";
    		else if(n10==4) s+="forty ";
    		else if(n10==5) s+="fifty ";
    		else if(n10==6) s+="sixty ";
    		else if(n10==7) s+="seventy ";
    		else if(n10==8) s+="eighty ";
    		else if(n10==9) s+="ninety ";
    		
    		if(n==0) s+="zero";
    	    else if(nlast==1) s+="one";
    	    else if(nlast==2) s+="two";
    	    else if(nlast==3) s+="three";
    	    else if(nlast==4) s+="four";
    	    else if(nlast==5) s+="five";
    	    else if(nlast==6) s+="six";
    	    else if(nlast==7) s+="seven";
    	    else if(nlast==8) s+="eight";
    	    else if(nlast==9) s+="nine";
    	}
	    else s+="It is not a correct figure!";
    	return s;
    }
}