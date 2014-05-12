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
		int n4 = n%10000;
		int n3 = n%1000;
		int n2 = n%100;
		int nlast = n2%10;
		s += translateEng1000(n4);
		s += translateEng100(n3);
		if(n2/10!=1) {
			s += translateEng20(n2);
		}
		if(n2/10==1) {
			s += translateEng10(n2);
		} else {
			s += translateEng1(nlast);
		}
		if(n==0) s+="zero";
		if(n>=100000) s+= "It is not a correct figure!";
		return s;
	}

	static String translateEng1(int nlast) {
		String s="";
		if(nlast==1) s+="one";
		else if(nlast==2) s+="two";
		else if(nlast==3) s+="three";
		else if(nlast==4) s+="four";
		else if(nlast==5) s+="five";
		else if(nlast==6) s+="six";
		else if(nlast==7) s+="seven";
		else if(nlast==8) s+="eight";
		else if(nlast==9) s+="nine";

		return s;
	}

	static String translateEng10(int n2) {
		String s="";		
		if(n2/10==1) {
			if(n2==10) s+="ten";
			else if(n2==11) s+="eleven";
			else if(n2==12) s+="twelve";
			else if(n2==13) s+="thirteen";
			else if(n2==14) s+="fourteen";
			else if(n2==15) s+="fifteen";
			else if(n2==16) s+="sixteen";
			else if(n2==17) s+="seventeen";
			else if(n2==18) s+="eighteen";
			else if(n2==19) s+="nineteen";
		}
		return s;
	}

	static String translateEng20(int n2) {
		String s="";		
		if(n2/10!=1) {
			int n10 = n2/10;
			if(n10==2) s+="twenty ";
			else if(n10==3) s+="thirty ";
			else if(n10==4) s+="forty ";
			else if(n10==5) s+="fifty ";
			else if(n10==6) s+="sixty ";
			else if(n10==7) s+="seventy ";
			else if(n10==8) s+="eighty ";
			else if(n10==9) s+="ninety ";
		}
		return s;
	}

	static String translateEng100(int n3) {
		String s="";
		if(n3/100!=0) {
			int n100 = n3/100;
			if(n100==1) s+="one hundred ";
			else if(n100==2) s+="two hundred ";
			else if(n100==3) s+="three hundred ";
			else if(n100==4) s+="four hundred ";
			else if(n100==5) s+="five hundred ";
			else if(n100==6) s+="six hundred ";
			else if(n100==7) s+="seven hundred ";
			else if(n100==8) s+="eight hundred ";
			else if(n100==9) s+="nine hundred ";
		}
		return s;
	}

	static String translateEng1000(int n4) {
		String s="";
		if(n4/10000!=0){
			int n10000 = n4/10000;
			if(n10000==1) {
				int n1000 = n4/1000;
				if(n1000==10) s+="ten ";
				else if(n1000==11) s+="eleven ";
				else if(n1000==12) s+="twelve ";
				else if(n1000==13) s+="thirteen ";
				else if(n1000==14) s+="fourteen ";
				else if(n1000==15) s+="fifteen ";
				else if(n1000==16) s+="sixteen ";
				else if(n1000==17) s+="seventeen ";
				else if(n1000==18) s+="eighteen ";
				else if(n1000==19) s+="nineteen ";
			}
			else if(n10000==2) s+="twenty ";
			else if(n10000==3) s+="thirty ";
			else if(n10000==4) s+="forty ";
			else if(n10000==5) s+="fifty ";
			else if(n10000==6) s+="sixty ";
			else if(n10000==7) s+="seventy ";
			else if(n10000==8) s+="eighty ";
			else if(n10000==9) s+="ninety ";
		}

		if(n4/1000!=0) {
			int n1000 = n4/1000;
			if(n4/10000!=1) {
				if(n1000==1 && n4/10000==0) s+="one ";
				else if(n1000==2) s+="two ";
				else if(n1000==3) s+="three ";
				else if(n1000==4) s+="four ";
				else if(n1000==5) s+="five ";
				else if(n1000==6) s+="six ";
				else if(n1000==7) s+="seven ";
				else if(n1000==8) s+="eight ";
				else if(n1000==9) s+="nine ";
			}
			s+="thousand ";
		}
		return s;    	
	}    
}
