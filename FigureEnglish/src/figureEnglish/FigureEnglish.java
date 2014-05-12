package figureEnglish;
import java.util.Scanner;

public class FigureEnglish {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        
        System.out.println(translateEng(input));
        
    }
    
    // ���l���p�󂷂�ϊ����郁�\�b�h
    static String translateEng(int n) {
    	String s="";
    	if(n==0) s+="zero";
    	else if(n==1) s+="one";
    	else if(n==2) s+="two";
    	else if(n==3) s+="three";
    	else if(n==4) s+="four";
    	else if(n==5) s+="five";
    	else if(n==6) s+="six";
    	else if(n==7) s+="seven";
    	else if(n==8) s+="eight";
    	else if(n==9) s+="nine";
    	else if(n==10) s+="ten";
    	else s+="It is not a correct figure!";
        return s;
    }
}