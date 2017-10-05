package test;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import dataObject.ReadObject;
import glib.Browser;
import glib.MyListner;
import pages.LoginPage;
@Listeners(MyListner.class)
public class HybridFW {
	ReadObject ob=new ReadObject();
	Browser br=new Browser();
	Properties p;
	WebDriver driver;
	String Browser_Name;
	LoginPage LoginPageOB;
	
	@BeforeClass
	public void init() throws IOException
	{
		}
	@BeforeTest
	public void cal() throws IOException
	{	p=ob.getproperties() ;
	driver=br.createdriver(p.getProperty("browser"));
	LoginPageOB=PageFactory.initElements(driver,LoginPage.class);

		
	}
	@Test
	public void smokeTest()
	{
		LoginPageOB.loginUser();
	}
	@AfterTest
	public void tearDown()
	{
		//driver.close();
	}

}
