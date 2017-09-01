package automatestruct;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1 extends BaseClass {
	public Test1(WebDriver driver) throws Exception {
		super(driver);
		}

  		public void f() throws Exception {
		Intermediate ii=new Intermediate(driver);
	  	ii.browserOpen();
		ii.logIn();
	  	ii.upload();
	  	ii.logOut1();
	  	ii.browserClose();
}

}

