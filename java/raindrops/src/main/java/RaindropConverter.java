import java.util.ArrayList;

class RaindropConverter {

    String convert(int number) {

        ArrayList<Integer> factors = new ArrayList<>();
        for(int i = 1; i <= number; i++){
            if(number % i == 0){
                factors.add(i);
            }
        }
        StringBuilder rainDropSpeak = new StringBuilder();
        for(int i = 0; i < factors.size(); i++){
            if (factors.get(i) == 3) {
                rainDropSpeak.append("Pling");
            } else if(factors.get(i) == 5) {
                rainDropSpeak.append("Plang");
            } else if(factors.get(i) == 7) {
                rainDropSpeak.append("Plong");
            }
        }
        String result = rainDropSpeak.toString();

        return (rainDropSpeak.length() == 0)? Integer.toString(number): result;



    }

}
