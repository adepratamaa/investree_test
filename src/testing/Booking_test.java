package testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Booking_test {

	WebDriver driver;
	WebElement startDate, endDate;
	String expectedText, actualText;	
	
	
	@Test 
	public void login() throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		driver.get("https://automationintesting.online/");
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[4]/div/div/div[3]/button")).click();		
		driver.findElement(By.name("firstname")).sendKeys("ade");
		driver.findElement(By.name("lastname")).sendKeys("pratama");
		driver.findElement(By.name("email")).sendKeys("adepratamaaaa99@gmail.com");
		driver.findElement(By.name("phone")).sendKeys("085712312324");
		
		Actions action = new Actions(driver);
		startDate = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[4]/div/div[2]/div[2]/div/div[2]/div[5]/div[2]/div/div[5]/a"));
		endDate = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[4]/div/div[2]/div[2]/div/div[2]/div[5]/div[2]/div/div[7]/a"));
//		action.dragAndDrop(startDate, endDate).build().perform();
		action.clickAndHold(startDate).release(endDate).build().perform();
//		action.clickAndHold(startDate).moveToElement(endDate).click().release().build().perform();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[4]/div/div[2]/div[3]/button[2]")).click();	
		Thread.sleep(3000);
		driver.quit();
	}
}