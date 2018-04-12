import java.util.regex.Pattern;

class LuhnValidator {

    boolean isValid(String candidate) {
        int sum = 0;
        String candidateWithOutSpace = candidate.replaceAll(" ", "");
        if (candidateWithOutSpace.length() <= 1 || !Pattern.matches("[\\d]+", candidateWithOutSpace)) {
            return false;
        }
            String[] stringArray = candidateWithOutSpace.split("");
            Integer[] integerArray = new Integer[stringArray.length];

            for (int i = 0; i < integerArray.length; i++) {
                integerArray[i] = Integer.parseInt(stringArray[i]);
            }


            for (int i = integerArray.length - 2; i >= 0; i-= 2){
                integerArray[i] = integerArray[i]*2;
                if (integerArray[i] > 9) {
                    integerArray[i] = integerArray[i] - 9;
                }
            }


            for (int i = 0; i < integerArray.length; i++) {
                sum += integerArray[i];
            }
        return (sum % 10 == 0);

    }
}
