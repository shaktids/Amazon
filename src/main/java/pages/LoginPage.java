package pages;

import static org.testng.Assert.assertEquals;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.mysql.jdbc.Driver;

import dataObject.ReadObject;
import dataObject.Xpaths;
import glib.Browser;

public class LoginPage implements Xpaths{


	public void loginUser()
	{
	Browser.driver.get(dataObject.ReadObject.p.getProperty("url"));
	assertEquals(home_page_title, Browser.driver.getTitle());
	Browser.driver.findElement(By.xpath(Xpaths.login_Button_xpath)).click();
	Browser.driver.findElement(By.xpath(Xpaths.login_Page_Uid_xpath)).sendKeys(Xpaths.user_Name);
	WebElement passButton=Browser.driver.findElement(By.xpath(login_Page_Pass_xpath));
	Actions ac=new Actions(Browser.driver);
	ac.sendKeys(passButton, Keys.ENTER).build().perform();
	}
}
