package check;

import constants.Constants;

public class Check {
	
	private String firstName = "tsuchiya";
	private String lastName = "yusuke";
	
	
	private void printName(String firstName, String lastName) {
		System.out.println("printNameメソッド → " + firstName + lastName);
	}
	

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Check check = new Check();
		check.printName(check.firstName, check.lastName);
		
		Pet pet = new Pet(Constants.CHECK_CLASS_JAVA, Constants.CHECK_CLASS_HOGE);
		pet.introduce();
		
		RobotPet robotPet = new RobotPet(Constants.CHECK_CLASS_R2D2, Constants.CHECK_CLASS_LUKE);
		robotPet.introduce();
		
		}

}
