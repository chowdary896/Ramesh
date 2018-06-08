package firstpackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Edit_CustomerName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ChromeOptions options = new ChromeOptions(); 
		//options.addArguments("disable-infobars");
		//System.setProperty("webdriver.ie.driver", "C:\\Users\\ext.cvelakaturichowd\\Downloads\\IEDriverServer_Win32_3.9.0\\IEDriverServer.exe");
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\ext.cvelakaturichowd\\Downloads\\chromedriver_win32\\chromeDriver.exe");
		//WebDriver driver = new InternetExplorerDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ext.cvelakaturichowd\\Downloads\\chromedriver_win32 (1)\\chromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(200,TimeUnit.SECONDS);
		driver.get("http://10.13.45.100:8086/"); 
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
		driver.findElement(By.xpath("//a[contains(text(), '3')]")).click();
		driver.findElement(By.xpath("//*[@id=\"grdCustomerList\"]/div[2]/table/tbody/tr[3]/td[1]/a[1]/img")).click();
		driver.findElement(By.id("UICustomerName")).clear();
		driver.findElement(By.id("UICustomerName")).sendKeys("ll");
		
		
		driver.close();
	
		
	}

}
