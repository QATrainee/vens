package antExample;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AntExample {
	WebDriver driver;
	
@BeforeTest
		
		public void a() throws Exception {
		//String workingdr = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", "E:\\workspace\\FinalANT\\src\\antExample\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
}
@Test
		public void g() throws Exception {
		File file = new File("E:\\workspace\\FinalANT\\src\\antExample\\Base.properties");
		FileInputStream fileInput;
		fileInput = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(fileInput);
		driver.get(prop.getProperty("URL"));
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath(prop.getProperty("candidatelogin"))).click();
		//log.info("Opening candidate menu");
		driver.findElement(By.xpath(prop.getProperty("loginbutton"))).click();
		//log.info("Clicking Login button");
		driver.switchTo().defaultContent();
		driver.switchTo().frame("candidatecontentframe");
		driver.findElement(By.xpath(prop.getProperty("mailid"))).sendKeys(prop.getProperty("username"));
		//log.info("Entering mailid");
		driver.findElement(By.xpath(prop.getProperty("password1"))).sendKeys(prop.getProperty("password"));
		//log.info("Entering password");
		driver.findElement(By.id(prop.getProperty("submitbutton"))).click();
		//log.debug("Clicking submit button");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
}
@Test
		public void h() throws Exception {
		File file = new File("E:\\workspace\\FinalANT\\src\\antExample\\Base.properties");
		FileInputStream fileInput;
		fileInput = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(fileInput);
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath(prop.getProperty("usersetting"))).click();
		//log.debug("Clicking user settings ");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath(prop.getProperty("logoututton"))).click();
		//log.debug("Clicking logout button ");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	
		}
@AfterTest
public void i() throws Exception {
	driver.quit();
	
}}

