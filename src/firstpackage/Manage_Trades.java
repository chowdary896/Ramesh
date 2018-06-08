package firstpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Manage_Trades {

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
							wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"Menu\"]/li[6]/a[1]"))).click();
							Thread.sleep(20000);
							driver.findElement(By.xpath("//*[@id=\"grdTradeTender\"]/div[1]/a")).click();
							WebElement webElement = driver.findElement(By.xpath(".//input[@id=\"FROM\"]"));
							Thread.sleep(1000);
							driver.findElement(By.xpath(".//input[@id=\"FROM\"]")).sendKeys("INDIA");
							webElement.sendKeys(Keys.TAB);
							Thread.sleep(1000);
							driver.findElement(By.xpath(".//input[@id=\"To\"]")).sendKeys("DUBAI");
							webElement.sendKeys(Keys.TAB);
							Thread.sleep(1000);
							driver.findElement(By.xpath(".//input[@id=\"DRYTRADES\"]")).sendKeys("ACSA");
							webElement.sendKeys(Keys.TAB);
							Thread.sleep(1000);
							driver.findElement(By.xpath(".//input[@id=\"REFERTRADES\"]")).sendKeys("REEFER CD");
							webElement.sendKeys(Keys.TAB);
							Thread.sleep(1000);
							driver.findElement(By.xpath(".//input[@id=\"ACTUALTRADENAMES\"]")).sendKeys("ABC");
							webElement.sendKeys(Keys.TAB);
							Thread.sleep(1000);
							driver.findElement(By.xpath(".//a[text()='Update']")).click();
							driver.close();
							
							
							
							

	}

}
