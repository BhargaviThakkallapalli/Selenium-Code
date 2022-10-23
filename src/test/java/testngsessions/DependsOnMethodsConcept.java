package testngsessions;

import org.testng.annotations.Test;

public class DependsOnMethodsConcept {
	
	@Test
	public void createAUser() {
		System.out.println(" create  a user");
	}
	
	@Test
	public void createUser() {
		System.out.println(" create user");
	}
//	@Test(dependsOnMethods = "createUser")
//	public void updateUser() {
//		System.out.println(" update user");
//	
//	}
//	@Test(dependsOnMethods = "createUser")
//	public void deleteUser() {
//		System.out.println(" delete user");
//	
//	}
	
	@Test
	public void updateUser() {
		createAUser();
		System.out.println(" update user");

	}

	@Test
		public void deleteUser() {
		createAUser();
		System.out.println(" delete user");

	}
}
