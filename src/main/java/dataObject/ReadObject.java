package dataObject;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadObject {
	public static Properties p = new Properties();
	
	public Properties getproperties() throws IOException {
		FileInputStream stream = new FileInputStream(
				new File(System.getProperty("user.dir") + "\\src\\main\\java\\dataObject\\Object.properties"));
		p.load(stream);
		return p;
	}

}
