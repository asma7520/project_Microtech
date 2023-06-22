package testcase;

import org.openqa.selenium.By;

import base.Base;

public class Verify_Welcome_David1_with_Valid_PassWord_in_Customer_Login extends Base {

	public static void main(String[] args) {
		
         setup();
		
		// I am in Landing Page
			navigetUrl("http://sit.skyitschool.com");

			// Click on Login
			click(By.xpath("//a[text()='LOG IN']"));

			// Click Customer Login
			click(By.xpath("//a[text()='Customer Login']"));

			// I enter emailid "david@gmail.com"
			sendKeys(By.name("mailuid"), "david@gmail.com");

			// I enter Passwordd "1234"
			sendKeys(By.name("pwd"), "1234");

			// I click Login button

			click(By.name("login-submit"));

			// I will check "Valid user name and valid password"
			
			String s = getText(By.xpath("//h2[text()='Welcome David1']"));
			if (s.contentEquals("Welcome David1"))
				System.out.println(" Welcome David1-Pass");
			else
				System.out.println("Welcome David1-fail");


	



		

	}

}
