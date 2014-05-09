package figureEnglish;



public class test {
	
	
	@Test
	public void main‚É0‚ð“ü‚ê‚Ä‚Ý‚é() {
		FigureEnglish figure = new FigureEnglish();
		String s = "Sss";
		String t = figure.main(0);
		System.out.println(t);
		assertThat(s,is(t));
	}	
}
