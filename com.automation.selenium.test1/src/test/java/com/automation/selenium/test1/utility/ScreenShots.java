package com.automation.selenium.test1.utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

public class ScreenShots {
	
	public static void captureScreenshot(WebDriver driver,String Name)
	{
		try {
			TakesScreenshot ts =(TakesScreenshot)driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source ,new File("./screenshots/"+Name+".png"));
			System.out.println("Screenshot taken");
		} catch (Exception e) {
			
			System.out.println("Exception while taking scrrenshot "+e.getMessage());

		}
	}

}
