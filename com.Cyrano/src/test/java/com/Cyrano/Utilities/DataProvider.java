package com.Cyrano.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class DataProvider {

	Properties prop;
	
	public DataProvider() {
		
		File src = new File("./Config/Data.properties");
		try {
			FileInputStream fis = new FileInputStream(src);
			prop = new Properties();
			prop.load(fis);
			
		} catch (Exception e) {
		
			System.out.println(e.getMessage());
		} 
		
	}
	public String getData(String keyToSearch) {
		return prop.getProperty(keyToSearch);
	}
	public String getBrowser() {
		return prop.getProperty("Browser");
	}
	public String getUrl() {
		return prop.getProperty("Url");
	}
	
}
