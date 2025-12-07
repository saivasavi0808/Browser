package Week1day2;

public class Browser {
public void launchBrowser(String Browsername) {
	System.out.println(Browsername);	
}
public String loadUrl() {
	return "url loaded successfully";
}
public static void main(String[] args) {
	Browser brow1=new Browser();
	brow1.launchBrowser("testleaf");
	System.out.println(brow1.loadUrl());
}

}
