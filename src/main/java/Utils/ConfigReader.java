package Utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	
	private Properties properties = new Properties();
	
	public Properties initializeProperty() throws IOException {
		
		
		FileInputStream input = new FileInputStream(".\\src\\test\\resources\\config\\config.properties");
		properties.load(input);
		
		return properties;
	}

}
