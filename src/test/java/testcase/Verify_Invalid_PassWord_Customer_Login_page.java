package testcase;

import org.openqa.selenium.By;

import base.Base;

public class Verify_Invalid_PassWord_Customer_Login_page extends Base{

	public static void main(String[] args) {
		
		setup();
		
		// I am in Landing Page
			navigetUrl("http://sit.skyitschool.com");

			// Click on Login
			click(By.xpath("//a[text()='LOG IN']"));

			// Click Customer Login
			click(By.xpath("//a[text()='Customer Login']"));

			// I enter Valid emailid "david@gmail.com"
			sendKeys(By.name("mailuid"), "david@gmail.com");

			// I enter Invalid Passwordd "1256"
			sendKeys(By.name("pwd"), "1256");

			// I click Login button

			click(By.name("login-submit"));

			// I will check "Invalid username or password!"
			
			String s = getText(By.id("error-msg"));
			if (s.contentEquals("Invalid username or password!"))
				System.out.println(" Invalid username or password!-Pass");
			else
				System.out.println("Invalid username or password!-fail");


	}

}
