package FigureEnglish;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import org.junit.Test;
import figureEnglish.FigureEnglish;

public class FigureEnglishTest {
	
	@Test
	public void test_p() {
		FigureEnglish fig = new FigureEnglish();
		String s = "zero";
		//String t = "zero";
		int n = 0;
		String t = fig.translateEng(n);
		System.out.println(t);
		assertThat(s,is(t));
	}
}
