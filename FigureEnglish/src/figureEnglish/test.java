package figureEnglish;



public class test {
	
	
	@Test
	public void mainに0を入れてみる() {
		FigureEnglish figure = new FigureEnglish();
		String s = "Sss";
		String t = figure.main(0);
		System.out.println(t);
		assertThat(s,is(t));
	}	
}
