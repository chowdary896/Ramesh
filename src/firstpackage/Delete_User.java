package firstpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Delete_User {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeOptions options = new ChromeOptions(); 
				options.addArguments("disable-infobars");
				//System.setProperty("webdriver.ie.driver", "C:\\Users\\ext.cvelakaturichowd\\Downloads\\IEDriverServer_Win32_3.9.0\\IEDriverServer.exe");
				//System.setProperty("webdriver.chrome.driver", "C:\\Users\\ext.cvelakaturichowd\\Downloads\\chromedriver_win32\\chromeDriver.exe");
				//WebDriver driver = new InternetExplorerDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ext.cvelakaturichowd\\Downloads\\chromedriver_win32 (1)\\chromeDriver.exe");
		WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				//driver.manage().timeouts().implicitlyWait(200,TimeUnit.SECONDS);
				driver.get("http://10.13.44.170:8075/"); 
				//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
				driver.findElement(By.id("UserName")).sendKeys("ext.cvelakaturichowd");
				driver.findElement(By.id("Password")).sendKeys("Abc99abc");
				driver.findElement(By.xpath("//*[@id=\"form0\"]/table/tbody/tr[2]/td[4]/input")).submit();
				//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
				WebDriverWait wait = new WebDriverWait(driver, 15);
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"Menu\"]/li[1]/a")));
				driver.findElement(By.xpath("//*[@id=\"Menu\"]/li[1]/a")).click(); 
				//driver.findElement(By.xpath("//*[@id=\"ToolBar\"]/a")).click();
				//driver.findElement(By.id("UICustomerName")).sendKeys("pp");
				//driver.findElement(By.xpath("//*[@id=\"ToolBar\"]/a[2]")).click();
				Thread.sleep(10000);
				//driver.findElement(By.xpath(".//a[contains(text(),'3')]")).click();
				//driver.findElement(By.xpath("//*[@id=\"grdCustomerList\"]/div[2]/table/tbody/tr[3]/td[1]/a[1]/img")).click();
				//*[@id="grdCustomerList"]/div[2]/table/tbody/tr[3]/td[1]/a[1]/img
				//driver.findElement(By.xpath("//*[@id=\"grdCustomerList\"]/div[2]/table/tbody/tr[3]/td[1]/a[1]/img")).click();
				//driver.findElement(By.xpath("//*[@id=\"ToolBar\"]/a[3]")).click();
				driver.findElement(By.xpath("//*[@id=\"grdCustomerList\"]//th[2]//span[@class='k-icon k-filter']")).click();
				Thread.sleep(1000);
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[2]//div[1]/span[1]//span[2]"))).click();
				Actions act = new Actions(driver);
				 WebElement element = driver.findElement(By.xpath("//div[2]//div[2]/div/ul/li[6]"));
				 Thread.sleep(2000);
				 act.moveToElement(element).click().perform();
				 Thread.sleep(1000);
				 driver.findElement(By.xpath(".//div[2]//span[2]//input[@class='k-formatted-value k-input']")).sendKeys("20");
				 driver.findElement(By.xpath("//div[2]//div[1]//div[2]//button[1]")).click();
				 
				 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"grdCustomerList\"]//tr[3]/td[1]/a[1]/img[1]"))).click();
				//driver.findElement(By.xpath("//*[@id=\"grdCustomerList\"]//tr[3]//td[1]//a[1]/img[1]")).click();
				
				
				//*[@id="grdCustomerList"]//tr[3]/td[1]/a[1]/img
					
					driver.findElement(By.xpath("//*[@id=\"ToolBar\"]/a[3]")).click();
				//driver.close();
			
			}

		}



