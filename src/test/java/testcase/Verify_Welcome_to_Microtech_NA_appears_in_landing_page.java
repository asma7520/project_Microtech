package testcase;

import org.openqa.selenium.By;

import base.Base;

public class Verify_Welcome_to_Microtech_NA_appears_in_landing_page extends Base{

	public static void main(String[] args) {
		
		
		setup();
		
		//visit skyschool landing page
		 navigetUrl("http://sit.skyitschool.com");
		
		
		 String t =  getText(By.xpath("//h1[text()='Welcome to MicroTech NA.']"));
		 
			if(t.contentEquals("Welcome to MicroTech NA."))
				System.out.println("Welcome to MicroTech NA. - logo pass" );
			else
				System.out.println("Welcome to MicroTech NA.- logo fail");
		

	}

}
