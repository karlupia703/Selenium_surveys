package Testcases;

import org.testng.annotations.Test;

import dataprovider_repository.DataRepo;

public class Multiple_Testcases {

	@Test(priority =1, dataProviderClass = DataRepo.class, dataProvider = "getData")
	public void launchUrl(String username, int emp_id, String email,int emp_no) {

	}
	
	@Test(priority =2,dataProviderClass = DataRepo.class, dataProvider = "getData")
	public void enterCredentials(String username, int emp_id, String email,int emp_no) {
	
	}
	
	@Test(priority =3,dataProviderClass = DataRepo.class, dataProvider = "getData")
	public void validateHomePage(String username, int emp_id, String email,int emp_no) {

	}
	@Test(priority =4, dataProviderClass = DataRepo.class, dataProvider = "getData")
	public void logout(String username, int emp_id, String email,int emp_no) {

}

}