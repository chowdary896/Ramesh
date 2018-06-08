package firstpackage;

import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Manage_Users {

	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\ext.cvelakaturichowd\\Downloads\\chromedriver_win32\\chromeDriver.exe");
		//System.setProperty("webdriver.ie.driver", "C:\\Users\\ext.cvelakaturichowd\\Downloads\\IEDriverServer_Win32_3.9.0\\IEDriverServer.exe");
				WebDriver driver = new InternetExplorerDriver();
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\ext.cvelakaturichowd\\Downloads\\chromedriver_win32 (1)\\chromeDriver.exe");
		//WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				//driver.manage().timeouts().implicitlyWait(200,TimeUnit.SECONDS);
				driver.get("http://10.13.44.170:8075/"); 
				driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
				driver.findElement(By.id("UserName")).sendKeys("ext.cvelakaturichowd");
				driver.findElement(By.id("Password")).sendKeys("Abc99abc");
				driver.findElement(By.xpath("//*[@id=\"form0\"]/table/tbody/tr[2]/td[4]/input")).submit();
				//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
				WebDriverWait wait = new WebDriverWait(driver, 15);
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"Menu\"]/li[3]/a[1]"))).click();
				//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			
				//driver.findElement(By.xpath("//*[@id=\"grdUserList\"]//div[2]//tr[2]//td[1]//a[1]//img")).click();
				//WebDriverWait wait1 = new WebDriverWait(driver, 30);
			    //wait1.until(ExpectedConditions.alertIsPresent());
				//driver.switchTo().alert().dismiss();
				driver.findElement(By.xpath("//*[@id=\"btnNew\"]/img")).click();
				WebElement webElement = driver.findElement(By.id("FName"));
				driver.findElement(By.id("FName")).sendKeys("Virat");
				webElement.sendKeys(Keys.TAB);
				driver.findElement(By.id("LName")).sendKeys("Kohli");
				webElement.sendKeys(Keys.TAB);
				driver.findElement(By.id("UserName")).sendKeys("Virat Kohli");
				webElement.sendKeys(Keys.TAB);
				driver.findElement(By.id("UserEmailID")).sendKeys("virat.kohli@cma-cgm.com");
				webElement.sendKeys(Keys.TAB);
				driver.findElement(By.xpath("//*[@id=\"form0\"]/div[2]/table/tbody/tr[3]/td[2]/div/div")).click();
			
				WebElement element = driver.findElement(By.xpath("//*[@id=\"roleCustom_listbox\"]/li[5]"));
		       ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
				element.click();
				
				driver.findElement(By.xpath("//*[@id=\"form0\"]/div[2]/table/tbody/tr[3]/td[2]/div/div")).click();
				WebElement element1 = driver.findElement(By.xpath("//*[@id=\"roleCustom_listbox\"]/li[4]"));
		        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element1);
				element1.click();
				
				driver.findElement(By.xpath("//*[@id=\"form0\"]/div[2]/table/tbody/tr[3]/td[2]/div/div")).click();
				WebElement element2 = driver.findElement(By.xpath("//*[@id=\"roleCustom_listbox\"]/li[3]"));
		        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element2);
				element2.click();
				
				driver.findElement(By.xpath("//*[@id=\"form0\"]/div[2]/table/tbody/tr[3]/td[6]/div/div")).click();
				WebElement element3 = driver.findElement(By.xpath("//*[@id=\"groupCustom_listbox\"]/li[1]"));
		        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element3);
				element3.click();
				
				driver.findElement(By.xpath("//input[@type='submit']")).submit();
				Thread.sleep(1000);
				driver.close();
				
	}

}
