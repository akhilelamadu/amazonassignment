package com.amzn.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class TestBase {

	public static WebDriver driver;
	public static Properties prop;
	public static Properties propx;
	

	public TestBase(){

//		// Configuration Property file
//		FileInputStream fis = new FileInputStream("src/main/java/com/amzn/config/config.properties");
//		// create Properties class object to access properties file
//		Properties prop = new Properties();
//		// load the properties file
//		prop.load(fis);
		
		try {
			prop = new Properties();
			FileInputStream fis = new FileInputStream("src/main/java/com/amzn/config/config.properties");
			prop.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			propx = new Properties();
			FileInputStream xfis = new FileInputStream("src/main/java/xpaths.properties");
			propx.load(xfis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}
	
	

	public static void intialization() {
		
		String Browsername= prop.getProperty("browser");
		//opening browser based on choice
		switch (Browsername) {
		case "Chrome":
			System.setProperty("webdriver.chrome.driver", "F:/software/chromedriver.exe");
			driver =new ChromeDriver();
			break;
		case "Firefox":
			System.setProperty("webdriver.gecko.driver", "F:/software/geckodriver.exe");
			driver = new FirefoxDriver();
			break;
		case "Edge":
			System.setProperty("webdriver.edge.driver", "F:/software/msedgedriver.exe");
			driver = new EdgeDriver();
			break;
		default:
			System.setProperty("webdriver.chrome.driver", "F:/software/chromedriver.exe");
			driver =new ChromeDriver();
		}
		
		driver.manage().deleteAllCookies();
		//driver.manage().window().maximize();
		//driver.manage().timeouts().pageLoadTimeout(TestUtil.Page_LoadT_imeout, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_wait,TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
		
	}

}
