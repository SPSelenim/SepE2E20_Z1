package com.stc.SepE2E20_Z1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class EnterUserName {
  @Test
  public void f() throws InterruptedException {
	  
	  WebDriver driver=null;	  
		String AppPath="E:\\SeleniumTraining1\\TestingApp.html";
		String ChrPath="E:\\SeleniumTraining1\\Drivers\\chromedriver.exe";

			System.setProperty("webdriver.chrome.driver", ChrPath);
				driver=new ChromeDriver();
				driver.get(AppPath);
driver.manage().window().maximize();
Thread.sleep(2000);
System.out.println("========================ENTERED================22212");
  driver.findElement(By.id(("UN"))).sendKeys("UN11111");
  Thread.sleep(2000);
  driver.findElement(By.id(("PWD"))).sendKeys("UN11111");
  Thread.sleep(2000);
  driver.quit();
  }
}

