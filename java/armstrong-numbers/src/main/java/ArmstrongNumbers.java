import java.util.ArrayList;


class ArmstrongNumbers {

	boolean isArmstrongNumber(int numberToCheck) {

		String[] intsToAddAndPower = String.valueOf(numberToCheck).split("");
		int result = 0;
		for (int i = 0; i < intsToAddAndPower.length; i++){
			result += Math.pow(Integer.parseInt(intsToAddAndPower[i]), intsToAddAndPower.length);
		}
		return (result == numberToCheck);
}
}
