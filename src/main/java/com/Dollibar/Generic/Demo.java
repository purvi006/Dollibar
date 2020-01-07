package com.Dollibar.Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo
{

	public static void main(String[] args) throws Exception  
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://192.168.40.128/dolibarr-3.3.1/htdocs/");
		Thread.sleep(8000);
		driver.close();
	}
}
