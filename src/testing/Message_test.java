package testing;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Message_test {
	
	WebDriver driver;
	String expectedText, actualText;	

	@Test(description = "Submit Message with valid data")
	public void Submit_Message_with_valid_data() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		driver.get("https://automationintesting.online/");
				
		driver.findElement(By.id("name")).sendKeys("ade pratama");
		driver.findElement(By.id("email")).sendKeys("adepratamaaaa99@gmail.com");
		driver.findElement(By.id("phone")).sendKeys("08575598674");
		driver.findElement(By.id("subject")).sendKeys("Pertanyaan");
		driver.findElement(By.id("description")).sendKeys("Saya ingin bertanya terkait dengan kamar hotel yang tersedia");
		driver.findElement(By.id("submitContact")).click();
		
		expectedText = "Thanks for getting in touch ade pratama!";
		actualText = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[5]/div[2]/div/h2")).getText();
		Assert.assertEquals(expectedText, actualText);
			if (expectedText.equals(actualText))
				System.out.println("===========Message berhasil dikirim===========");
			else
				System.out.println("===========Message gagal dikirim===========");
		driver.close();
	}
	
	@Test(description = "Submit Message form with invalid description data")
	public void Submit_Message_form_with_invalid_description_data() throws InterruptedException {
			
		System.setProperty("webdriver.chrome.driver","drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		driver.get("https://automationintesting.online/");
				
		driver.findElement(By.id("name")).sendKeys("ade pratama");
		driver.findElement(By.id("email")).sendKeys("adepratamaaaa99@gmail.com");
		driver.findElement(By.id("phone")).sendKeys("08575598674");
		driver.findElement(By.id("subject")).sendKeys("Pertanyaan");
		driver.findElement(By.id("description")).sendKeys("ade");
		driver.findElement(By.id("submitContact")).click();
		
		expectedText = "size must be between 20 and 2000";
		actualText = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[5]/div[2]/form/div[6]/p[1]")).getText();
		Assert.assertEquals(expectedText, actualText);
			if (expectedText.equals(actualText))
				System.out.println("===========Message gagal dikirim===========");
			else
				System.out.println("");
		driver.close();
		}
		

	@Test(description = "Submit Message form with invalid name data")
	public void Submit_Message_form_with_invalid_name_data() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		driver.get("https://automationintesting.online/");
				
		driver.findElement(By.id("name")).sendKeys(" ");
		driver.findElement(By.id("email")).sendKeys("adepratamaaaa99@gmail.com");
		driver.findElement(By.id("phone")).sendKeys("08575598674");
		driver.findElement(By.id("subject")).sendKeys("Pertanyaan");
		driver.findElement(By.id("description")).sendKeys("Saya ingin bertanya terkait dengan kamar hotel yang tersedia");
		driver.findElement(By.id("submitContact")).click();
		
		expectedText = "must not be blank";
		actualText = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[5]/div[2]/form/div[6]/p")).getText();
		Assert.assertEquals(expectedText, actualText);
			if (expectedText.equals(actualText))
				System.out.println("===========Message gagal dikirim===========");
			else
				System.out.println("");
		driver.close();
	}
		

		@Test(description = "Submit Message form with invalid email data")
		public void Submit_Message_form_with_invalid_email_data() throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver","drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize(); 
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

			driver.get("https://automationintesting.online/");
					
			driver.findElement(By.id("name")).sendKeys("ade pratama");
			driver.findElement(By.id("email")).sendKeys("1235");
			driver.findElement(By.id("phone")).sendKeys("08575598674");
			driver.findElement(By.id("subject")).sendKeys("Pertanyaan");
			driver.findElement(By.id("description")).sendKeys("Saya ingin bertanya terkait dengan kamar hotel yang tersedia");
			driver.findElement(By.id("submitContact")).click();
			
			expectedText = "must be a well-formed email address";
			actualText = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[5]/div[2]/form/div[6]/p")).getText();
			Assert.assertEquals(expectedText, actualText);
				if (expectedText.equals(actualText))
					System.out.println("===========Message gagal dikirim===========");
				else
					System.out.println("");
			driver.close();
		}
		

		@Test(description = "Submit Message form with invalid phone data")
		public void Submit_Message_form_with_invalid_phone_data() throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver","drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize(); 
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

			driver.get("https://automationintesting.online/");
					
			driver.findElement(By.id("name")).sendKeys("ade pratama");
			driver.findElement(By.id("email")).sendKeys("adepratamaaaa99@gmail.com");
			driver.findElement(By.id("phone")).sendKeys("123");
			driver.findElement(By.id("subject")).sendKeys("Pertanyaan");
			driver.findElement(By.id("description")).sendKeys("Saya ingin bertanya terkait dengan kamar hotel yang tersedia");
			driver.findElement(By.id("submitContact")).click();
			
			expectedText = "size must be between 11 and 21";
			actualText = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[5]/div[2]/form/div[6]/p")).getText();
			Assert.assertEquals(expectedText, actualText);
				if (expectedText.equals(actualText))
					System.out.println("===========Message gagal dikirim===========");
				else
					System.out.println("");
			driver.close();
		}
		
	
		@Test(description = "Submit Message form with invalid subject data")
		public void Submit_Message_form_with_invalid_subject_data() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize(); 
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

			driver.get("https://automationintesting.online/");
					
			driver.findElement(By.id("name")).sendKeys("ade pratama");
			driver.findElement(By.id("email")).sendKeys("adepratamaaaa99@gmail.com");
			driver.findElement(By.id("phone")).sendKeys("085755066708");
			driver.findElement(By.id("subject")).sendKeys("ade");
			driver.findElement(By.id("description")).sendKeys("Saya ingin bertanya terkait dengan kamar hotel yang tersedia");
			driver.findElement(By.id("submitContact")).click();
			
			expectedText = "size must be between 5 and 100";
			actualText = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[5]/div[2]/form/div[6]/p")).getText();
			Assert.assertEquals(expectedText, actualText);
				if (expectedText.equals(actualText))
					System.out.println("===========Message gagal dikirim===========");
				else
					System.out.println("");
			driver.close();	
		}
	
}

