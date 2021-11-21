package com.gittest;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.support.ui.Select;

public class Base_Class {
	public static WebDriver driver;
	public static Select s;
	public static Properties prop;
	
	
	public static void properties(String path) throws IOException {
		File f = new File(path);
		FileInputStream fi = new FileInputStream(f);
		prop = new Properties();
		prop.load(fi);
	}


	public static WebDriver browser(String browser_name) {
		if (browser_name.equalsIgnoreCase("CHROME")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();

		} else if (browser_name.equalsIgnoreCase("FIREFOX")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\Driver\\geckodriver.exe");
			driver = new FirefoxDriver();

		} else {
			System.out.println("CHROME/FIREFOX");
		}
		return driver;
	}

	public static void geturl(String URL) {
		driver.get(URL);
	}

	public static void click(WebElement element) {
		element.click();
	}

	public static void sendkeys(WebElement element, String Value) {
		element.sendKeys(Value);
	}

	public static void action(String action_function, WebElement element) {
		Actions a = new Actions(driver);
		if (action_function.equalsIgnoreCase("movetoelement")) {
			a.moveToElement(element).build().perform();
		} else {
			System.out.println("actions");
		}
	}

	public static void robot(String cursor_action) throws AWTException {
		Robot r = new Robot();
		if (cursor_action.equalsIgnoreCase("DOWN")) {
			r.keyPress(KeyEvent.VK_DOWN);
			// r.keyRelease(KeyEvent.VK_DOWN);
		} else if (cursor_action.equalsIgnoreCase("UP")) {
			r.keyPress(KeyEvent.VK_UP);
			r.keyRelease(KeyEvent.VK_UP);
		} else if (cursor_action.equalsIgnoreCase("Enter")) {
			r.keyPress(KeyEvent.VK_ENTER);
		} else {
			System.out.println("not correct input");
		}

	}

	public static void wait(int time_in_seconds) {
		driver.manage().timeouts().implicitlyWait(time_in_seconds, TimeUnit.SECONDS);
	}

	public static void screenshot(String file_name) throws IOException {
		TakesScreenshot t = (TakesScreenshot) driver;
		File source = t.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\Dinesh\\eclipse-workspace\\mainproject\\snapshot" + file_name + ".png");
		FileUtils.copyFile(source, destination);
	}

	public static void scrolldown(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()", element);
	}

	public static void dropDown(String Option, String droplist, WebElement element) {
		s = new Select(element);
		if (Option.equalsIgnoreCase("text")) {
			s.selectByVisibleText(droplist);
		}
		if (Option.equalsIgnoreCase("value")) {
			s.selectByValue(droplist);

		}

	}

	public static void dropDown_Index(int n, WebElement element) {
		s = new Select(element);

		List<WebElement> options = s.getOptions();
		/*
		 * for (WebElement alloptions : options) { String text = alloptions.getText();
		 * System.out.println(text);
		 */
		int size = options.size();
		System.out.println(size);
		for (int i = 0; i <= size; i++) {
			if (i == n) {
				s.selectByIndex(i);
			}

		}
	}

	public static void getOption(WebElement element) {
		s = new Select(element);
		List<WebElement> options = s.getOptions();
		for (WebElement alloptions : options) {
			String text = alloptions.getText();
			System.out.println(text);
		}
	}

}
