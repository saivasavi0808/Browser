package Week1day2;

public class EdgeBrowser {

	public static void main(String[] args) {
		Browser brow2=new Browser();
		brow2.launchBrowser("testleaf");
		String url=brow2.loadUrl();
		System.out.println(url);

	}

}
