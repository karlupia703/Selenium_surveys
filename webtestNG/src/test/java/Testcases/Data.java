package Testcases;

import org.testng.annotations.DataProvider;

public class Data {

	@DataProvider(name = "NinjaData")
	public static Object [][] ninjadataSupply(){
		Object[][] data = {{"seleniumpanda@gmail.com", "Selenium@123"},
                           {"seleniumpanda1@gmail.com", "Selenium@123"},
                           {"seleniumpanda2@gmail.com", "Selenium@123"},
                           {"seleniumpanda3@gmail.com", "Selenium@123"}};

return data;

	}
	@DataProvider(name = "rediffData")
	public static Object [][] rediffDataSupply(){
		Object[][] data = {{"seleniumpanda@gmail.com", "Selenium@123"},
                          {"seleniumpanda1@gmail.com", "Selenium@123"},
                          {"seleniumpanda2@gmail.com", "Selenium@123"},
                          {"seleniumpanda3@gmail.com", "Selenium@123"}};
	
	return data;
}
}
