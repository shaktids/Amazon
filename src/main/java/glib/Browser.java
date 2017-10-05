package glib;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {
	public static WebDriver driver;
	

	public  WebDriver createdriver(String  p) throws IOException {
//System.out.println(p.getProperty("browser"));
		
		if (p.equals("fox")) {

			// final String addOnPath =
			// "D:\\Users\\Auro\\Downloads\\adblock_plus-2.8.2.4234-beta-an fx
			// sm tb.xpi";
			// File addOnFile = new File(addOnPath);
			// FirefoxProfile profile = new FirefoxProfile();
			// profile.addExtension(addOnFile);
			// driver = new FirefoxDriver(profile);

			System.setProperty("webdriver.gecko.driver", "C:\\Sw\\geckodriver.exe");
			System.out.println("Printing");
			driver = new FirefoxDriver();
			

		}
		 if (p.equals("chrome")) {
		
			 System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\chromedriver.exe");
		 driver = new ChromeDriver();
		
		 }
		//
		// if (MyConst.bwsr.equals("foxmm")) {
		// System.setProperty("webdriver.chrome.driver",
		// "C:\\sw\\chromedriver1.exe");
		// File addonpath = new File("C:\\sw\\extension_3_8_6.crx");
		// ChromeOptions chrome = new ChromeOptions();
		// chrome.addExtensions(addonpath);
		// driver = new ChromeDriver(chrome);
		//
		// }
		// if (MyConst.bwsr.equals("foxbb")) {
		// File file = new
		// File("C:\\sw\\phantomjs-2.1.1-windows\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe");
		// System.setProperty("phantomjs.binary.path", file.getAbsolutePath());
		// driver = new PhantomJSDriver();
		// }
		// if (MyConst.bwsr.equals("html")) {
		//
		// // driver1 = new HtmlUnitDriver();
		// // driver = new HtmlUnitDriver(BrowserVersion.BEST_SUPPORTED);
		// }

		return driver;
	}
}
