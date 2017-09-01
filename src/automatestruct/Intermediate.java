package automatestruct;

import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class Intermediate extends  BaseClass{
	
	public Intermediate(WebDriver driver) throws Exception {
		super(driver);
		
	}
	
	
	public void upload() throws Exception {
		// uploading a resume from external path
		/**
		 * @author karthiga balapriya work name : upload
		 */
		Properties prop ;
		FileInputStream fileInput = new FileInputStream("E:\\workspace\\TechFetch.Automation\\Locator.properties");
		prop = new Properties();
		prop.load(fileInput);
		driver.switchTo().defaultContent();
		driver.switchTo().frame("contentframe");

		driver.findElement(By.xpath(".//*[@id='ucMoreResumes_lblJobs']/table/tbody/tr[1]/td[4]/a/img")).click();
		log.debug("Clicking Replacedocs");

		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame("replacedoccontentframe");
		Thread.sleep(1000);
		driver.findElement(By.id("resumeupload")).clear();
		driver.findElement(By.id("resumeupload")).sendKeys(prop.getProperty("path"));
		log.debug("Uploading Resume");

		Thread.sleep(10000);

		driver.findElement(By.xpath(".//*[@id='btnSubmit']")).click();
		log.debug("Clicking Submit button");

		Thread.sleep(3000);
		driver.findElement(By.id("btnClose")).click();
		log.debug("Clicking Close button");

	}

	void logOut1() throws Exception
	{
		
		System.out.println("dsa");
		driver.switchTo().defaultContent();

		Thread.sleep(10000);
		File file = new File("E:\\workspace\\structure\\test.properties");
		FileInputStream fileInput;
		fileInput = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(fileInput);
		// Logout...
		driver.findElement(By.xpath(prop.getProperty("usersetting"))).click();
		log.debug("Clicking user settings ");
		Thread.sleep(10000);
		driver.findElement(By.xpath(prop.getProperty("logoutbutton"))).click();
		log.debug("Clicking logout button ");
		Thread.sleep(10000);
	}


public void close() throws Exception {
		
			//logOut();
			browserClose();

	}
}
