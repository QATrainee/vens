package log4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logtech {
  public static void main(String[] args) throws IOException, InterruptedException {
	  Logger log = Logger.getLogger("com1");
	  System.setOut(new PrintStream(new FileOutputStream("obb.txt")));
		  WebDriver driver;
		  System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\chromedriver.exe");
		  driver = new ChromeDriver(); 
		  driver.get("http://www.techfetch.com/");
		  log.debug("opening webiste");
		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		  java.util.List<WebElement> links = driver.findElements(By.tagName("a"));
		  System.out.println(links.size());
		  log.debug("getting size");

			for (int i = 1; i<=links.size(); i=i+1)

			{

				System.out.println(links.get(i).getAttribute("href"));
				log.debug("getting link");

			}
			Thread.sleep(1000);
			driver.quit();
			log.debug("closing website");
			}

}
