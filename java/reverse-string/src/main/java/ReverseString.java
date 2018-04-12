class ReverseString {

    String reverse(String inputString) {
        String reverse = "";
        int idx = inputString.length()-1;

        for(int i = 0; i < inputString.length(); i++){
            reverse += inputString.charAt(idx--);
        }

        return  reverse;
    }
  
}