package com.orangehrm.rough;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestProperties {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println(System.getProperty("user.dir"));
		Properties config = new Properties();
		Properties or = new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\new2\\Desktop\\selenium project\\com.orangeHRM\\src\\test\\resources\\properties\\config.properties");
		config.load(fis);
		fis=new FileInputStream("C:\\Users\\new2\\Desktop\\selenium project\\com.orangeHRM\\src\\test\\resources\\properties\\or.properties");
		or.load(fis);
	}

}
