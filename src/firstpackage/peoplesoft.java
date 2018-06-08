package firstpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class peoplesoft {
    
    public static void main(String[]args) throws InterruptedException
    {

    System.setProperty("webdriver.chrome.driver", "C:\\Users\\ext.cvelakaturichowd\\Downloads\\chromedriver_win32 (1)\\chromeDriver.exe");
    WebDriver driver = new ChromeDriver();  
    
    driver.get("https://finance.corp.syntel.in/psp/syfnprod/EMPLOYEE/ERP/?cmd=logout");
    
    driver.findElement(By.xpath("//*[@id='userid']")).sendKeys("MSiddiq");
    driver.findElement(By.xpath("//*[@id='pwd']")).sendKeys("May2018**");
            driver.findElement(By.name("Submit")).click();
            
        Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id='win0groupletPTNUI_LAND_REC_GROUPLET$7']")).click();
            Thread.sleep(2000);
            driver.findElement(By.linkText("Project Costing")).click();
            Thread.sleep(2000);
            driver.switchTo().frame(0);
            driver.findElement(By.linkText("Maintain Projects")).click();
            
            driver.switchTo().defaultContent();
           
             //driver.findElement(By.id("ptifrmtgtframe")).click();
            driver.switchTo().frame("ptifrmtgtframe");
             Thread.sleep(2000);
            driver.findElement(By.xpath("/html/body/form/div[4]/table/tbody/tr/td/div/table/tbody/tr/td[2]/a/span")).click();
             Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\'#ICSearch\']")).click();
            Thread.sleep(2000);
            driver.findElement(By.name("#ICPanel10")).click();
            
            driver.switchTo().defaultContent();
            driver.switchTo().frame("ptifrmtgtframe");  
            // driver.findElement(By.id("ptifrmtgtframe")).click();
             Thread.sleep(2000);
             Select selectByValue = new Select(driver.findElement(By.id("SY_TECH_TBL_SY_TECH_CHECK")));
             selectByValue.selectByValue("YES");
             Thread.sleep(2000);
             driver.switchTo().defaultContent();
                //driver.switchTo().frame("ptifrmtgtframe");
                Thread.sleep(2000);
                driver.findElement(By.xpath("//*[@id=\"#ICOK\"]")).click();
                Thread.sleep(2000);
                driver.switchTo().frame("ptifrmtgtframe");
                Thread.sleep(2000);
                driver.findElement(By.xpath("//*[@id=\"win0divPSPANELTABLINKS\"]//table/tbody/tr/td/a[11]")).click();
              //*[@id="win0divPSPANELTABLINKS"]//table/tbody/tr/td/a[11]
                driver.close();
             
             
    
            
            

       

}
}


