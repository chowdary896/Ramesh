package firstpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Pricer_File_Status {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ext.cvelakaturichowd\\Downloads\\chromedriver_win32 (1)\\chromeDriver.exe");
		//System.setProperty("webdriver.ie.driver", "C:\\Users\\ext.cvelakaturichowd\\Downloads\\IEDriverServer_Win32_3.9.0\\IEDriverServer.exe");
				//WebDriver driver = new InternetExplorerDriver();
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				//driver.manage().timeouts().implicitlyWait(200,TimeUnit.SECONDS);
				driver.get("http://10.13.44.170:8075/"); 
				driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
				driver.findElement(By.id("UserName")).sendKeys("ext.cvelakaturichowd");
				driver.findElement(By.id("Password")).sendKeys("Abc99abc");
				driver.findElement(By.xpath("//*[@id=\"form0\"]/table/tbody/tr[2]/td[4]/input")).submit();
				WebDriverWait wait = new WebDriverWait(driver, 15);
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"Menu\"]/li[7]/a[1]"))).click();
				Thread.sleep(20000);
				driver.findElement(By.xpath(".//span[@class='k-icon k-i-arrow-s']")).click();
				Actions act = new Actions(driver);
				 WebElement element = driver.findElement(By.xpath("//*[@id=\"ddlTender_listbox\"]/li[3]"));
				 Thread.sleep(20000);
				 act.moveToElement(element).click().perform();
				 Thread.sleep(10000);
				 driver.close();
				
	}			

}
