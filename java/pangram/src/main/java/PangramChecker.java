import java.util.Set;
import java.util.TreeSet;

public class PangramChecker {

    public boolean isPangram(String input) {

        String removeAllNonAlphaAndLowerCase = input.replaceAll("[^a-zA-Z]", "").toLowerCase();
        String[] tempStringArray = removeAllNonAlphaAndLowerCase.split("");

        Set<String> possiblePangram = new TreeSet<String>();

        for(int i = 0; i < tempStringArray.length; i++){

            possiblePangram.add(tempStringArray[i]);
        }

        return (possiblePangram.size() == 26);
    }

}
