package com.cts.pnrservice.manager;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ApplicationPropertiesManager {
	static Properties prop = new Properties();
	static InputStream input = null;
	
	public static Properties getProperties(String fileName) {
		try {
			input = new FileInputStream(fileName);
			prop.load(input);
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return prop; 
	}
}
