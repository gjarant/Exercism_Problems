import java.util.regex.Pattern;

class IsbnVerifier {

    boolean isValid(String stringToVerify) {

        if(Pattern.matches(".*[A-W, Y-Z].*", stringToVerify)){
            return false;
        }
        if(stringToVerify.equals("")){
            return false;
        }
        if(stringToVerify.replaceAll("-", "").split("").length != 10){
            return false;
        }

        String[] isbnToVerify = stringToVerify.replaceAll("-", "").split("");

        for(int i = 0; i < isbnToVerify.length-1; i++){
            if (isbnToVerify[i].equals("X")){
                return false;
            }
        }

        for(int i = 0; i < isbnToVerify.length; i++){
            if (isbnToVerify[i].equals("X")){
                isbnToVerify[i] = "10";
            }
        }

        int multiply = 10;
        int result = 0;
        for(int i = 0; i < isbnToVerify.length; i++ ){
            result += Integer.valueOf(isbnToVerify[i]) * multiply--;
        }
        return (result%11==0);
        }
    }




