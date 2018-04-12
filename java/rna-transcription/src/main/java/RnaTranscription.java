import java.util.Arrays;

class RnaTranscription {

    String transcribe(String dnaStrand) {

        String[] dnaStrandArray = dnaStrand.split("");

        for (int i = 0; i < dnaStrandArray.length; i++) {
            if (dnaStrandArray[i].equals("G")) {
                dnaStrandArray[i] = "C";
            } else if (dnaStrandArray[i].equals("C")) {
                dnaStrandArray[i] = "G";
            } else if (dnaStrandArray[i].equals("T")) {
                dnaStrandArray[i] = "A";
            } else if (dnaStrandArray[i].equals("A")) {
                dnaStrandArray[i] = "U";
            }
        }

        return String.join("", dnaStrandArray);

    }
}
