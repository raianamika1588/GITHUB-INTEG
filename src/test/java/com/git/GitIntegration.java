package com.git;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class GitIntegration {

	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe" );  
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https:\\www.facebook.com");
		
		System.out.println("GIT INTEGATION");

	}

}
