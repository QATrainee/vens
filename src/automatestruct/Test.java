package automatestruct;

import org.openqa.selenium.WebDriver;

public class Test extends BaseClass{

	
	static WebDriver driver;
	public Test(WebDriver driver) throws Exception {
		super(driver);
		
	}

	public static void main(String[] args) throws Exception {

		Intermediate ii=new Intermediate(driver);
		ii.browserOpen();
		ii.logIn();
		ii.upload();
		ii.logOut1();
		ii.browserClose();
}


}
