package dataprovider_repository;



import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;


public class DataRepo {

	@DataProvider
	
	public static Object[][] getData(Method name){
		System.out.println("Test case which has the method is: " + name.getName());
		
		Object[][] data = new Object[3][4];
		
		data[0][0] = "Username1";
		data[0][1] = 101;
		data[0][2] = "roohjeani67@gmail.com";
		data[0][3] = 98687878;
		
		data[1][0] = "Username2";
		data[1][1] = 102;
		data[1][2] = "roohjeani2@gmail.com";
		data[1][3] = 98787818;
		
		data[2][0] = "Username3";
		data[2][1] = 103;
		data[2][2] = "roohjeani3@gmail.com";
		data[2][3] = 98787873;
		
		return data;
		
	}
	}

