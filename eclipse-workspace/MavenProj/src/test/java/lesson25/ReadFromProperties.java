package lesson25;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadFromProperties {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Properties prop = new Properties();
		FileInputStream fis ;
		try {
			fis = new FileInputStream("src/test/java/lesson25/demo.praperties");
			prop.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}

		String username = prop.getProperty("username");
		String password = prop.getProperty("password");
		System.out.println("username: " + username);
		System.out.println("password: " + password);
		
		}
	}


