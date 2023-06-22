package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import base.Base;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Verify_MicroTech_NA_Logo_appears_in_landing_page extends Base{

	public static void main(String[] args) throws InterruptedException {
		/*
		 * //First I did Manually
		WebDriverManager.chromedriver().setup();
		WebDriver driver;
		driver = new ChromeDriver();    
		driver.manage().window().maximize();
		*/
		
		setup();
		
		//visit skyschool landing page
		
		//driver.get("http://sit.skyitschool.com");
		 navigetUrl("http://sit.skyitschool.com");
		
		//click in Log In menue
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//a[text()='LOG IN']")).click();
		
		click(By.xpath("//a[text()='LOG IN']"));
		//write User Id
		//Thread.sleep(2000);
		//driver.findElement(By.name("mailuid")).sendKeys("testpilot@gmail.com");
		sendKeys(By.name("mailuid"),"testpilot@gmail.com");
		//write password
		
		//Thread.sleep(2000);
		//driver.findElement(By.name("pwd")).sendKeys("1234");
		
		sendKeys(By.name("pwd"),"1234");
		
		
		//click on Login
		//Thread.sleep(2000);
		//driver.findElement(By.name("login-submit")).click();
		click(By.name("login-submit"));
		
		//verify homepage logo
		//Thread.sleep(2000);
		//String t = driver.findElement(By.xpath("//h1[text()='MicroTech NA']")).getText();
		String t =  getText(By.xpath("//h1[text()='MicroTech NA']"));
		 
		if(t.contentEquals("MicroTech NA"))
			System.out.println("MicroTech NA - logo pass" );
		else
			System.out.println("MicroTech NA - logo fail");
		
		//Thread.sleep(2000);
		//driver.close();
		
	}
}
