package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
	public static WebDriver driver;

	public static void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}
	
	public static void navigetUrl(String url) {
		driver.get(url);
	}
	
	public static void click(By byObject) {
		driver.findElement(byObject).click();
	}

	public static void sendKeys(By byObject, String sendValue) {
		driver.findElement(byObject).sendKeys(sendValue);
	}

	public static String getText(By byObject) {
		String s = driver.findElement(byObject).getText();
		return s;

	}



}
