package org.testing;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserLaunch {

	public static void main(String[] args) throws IOException, InterruptedException {

		// Browser Configuration
		System.setProperty("webdriver.edge.driver",
				"C:\\Kannan\\EclipseProjects\\SeleniumSepBatch\\Drivers\\msedgedriver.exe");

		// List l = new ArrayList(); ---------> Upcasting
		WebDriver driver = new EdgeDriver();

		// Url Launch
		driver.get("https://www.facebook.com");

		driver.manage().window().maximize();
		
		
		//Css Value
		
		
		WebElement txtUser = driver.findElement(By.xpath("//input[@type='text']"));
		
		System.out.println(txtUser.getCssValue("font-weight"));
		
		System.out.println(txtUser.getCssValue("color"));
		
		System.out.println(txtUser.getCssValue("font-size"));

		System.out.println(txtUser.getCssValue("background-color"));
		
		System.out.println(txtUser.getCssValue("text-align"));
		
		System.out.println(txtUser.getCssValue("font"));

		
	
		
		
		
		
		
		

	}

}
