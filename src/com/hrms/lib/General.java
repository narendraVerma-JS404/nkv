package com.hrms.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class General extends Global{
	
	
	//std rule: To provide all re-usable fun:/methods related to whole application
	public void openApplication() {
	driver = new ChromeDriver();
	driver.navigate().to(url);
	System.out.println("Application Opened");
	}
	public void closeApplication() {
	driver.quit();
	System.out.println("Application closed");
	}
	public void login() {
	driver.findElement(By.name(txt_loginame)).sendKeys(un);
	driver.findElement(By.name(txt_password)).sendKeys(pw);
	driver.findElement(By.name(btn_login)).click();
	System.out.println("Login completed");
	}
	public void logout() {
	driver.findElement(By.linkText(link_logout)).click();
	System.out.println("Logout completed");
	}
	public void enterFrame() {
	driver.switchTo().frame(frm_empinfo);
	System.out.println("Enter into frame");
	}
	public void exitFrame() {
	driver.switchTo().defaultContent();
	System.out.println("Exit from frame");
	}
	public void addNewEmp() {
	driver.findElement(By.xpath(btn_add)).click();
	driver.findElement(By.name(txt_efn)).sendKeys(efn);
	driver.findElement(By.name(txt_eln)).sendKeys(eln);
	driver.findElement(By.id(btn_save)).click();
	System.out.println("New emp Added");
	}
	

}
