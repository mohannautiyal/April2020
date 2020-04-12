package com.home.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesUtil {

	public static Properties configReader;
	public static String configFilePath = "\\src\\main\\java\\com\\home\\config\\config.properties";

	static {
		configReader = new Properties();
		try {
			FileInputStream fs = new FileInputStream(new File(System.getProperty("user.dir") + configFilePath));
			configReader.load(fs);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
