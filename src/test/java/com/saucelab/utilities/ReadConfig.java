package com.saucelab.utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	Properties properties;

	String path = "C:\\Users\\admin\\workspace\\FrameworkDec2024\\Configuration\\Config.properties";

	public ReadConfig(){

		try{
			properties = new Properties();
			FileInputStream fis = new FileInputStream(path);
			properties.load(fis);

		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}

	}
	// method to read key value from the property file.
	public String getBrowser(){

		String browserKey = properties.getProperty("browser");

		// check if value is present or null
		if(browserKey!=null)
			return browserKey;

		else
			throw new RuntimeException("Browser value is not defined in property file.");	
	}
	public String getUrl(){

		String urlKey = properties.getProperty("url");

		// check if value is present or null
		if(urlKey!=null)
			return urlKey;

		else
			throw new RuntimeException("URL value is not defined in property file.");	
	}

}
