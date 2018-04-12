import java.util.ArrayList;
import java.util.List;

class ProteinTranslator {

    List<String> translate(String rnaSequence) {
        String[] rnaSequenceArray = rnaSequence.split("(?<=\\G...)");
        ArrayList<String> aminoAcids = new ArrayList<>();

        for(int i = 0; i < rnaSequenceArray.length; i++){
            if(rnaSequenceArray[i].equals("AUG")){
                aminoAcids.add("Methionine");
            } else if(rnaSequenceArray[i].equals("UUU") ||
                    rnaSequenceArray[i].equals("UUC")   ){
                aminoAcids.add("Phenylalanine");
            }
            else if(rnaSequenceArray[i].equals("UUA") ||
                    rnaSequenceArray[i].equals("UUG")){
                aminoAcids.add("Leucine");
            }
            else if(rnaSequenceArray[i].equals("UCU")||
                    rnaSequenceArray[i].equals("UCC")||
                    rnaSequenceArray[i].equals("UCA")||
                    rnaSequenceArray[i].equals("UCG")){
                aminoAcids.add("Serine");
            }
            else if(rnaSequenceArray[i].equals("UAU")||
                    rnaSequenceArray[i].equals("UAC")){
                aminoAcids.add("Tyrosine");
            }
            else if(rnaSequenceArray[i].equals("UGU") ||
                    rnaSequenceArray[i].equals("UGC")){
                aminoAcids.add("Cysteine");
            }
            else if(rnaSequenceArray[i].equals("UGG")){
                aminoAcids.add("Tryptophan");
            }
            else if(rnaSequenceArray[i].equals("UAA") ||
                    rnaSequenceArray[i].equals("UAG")||
                    rnaSequenceArray[i].equals("UGA")){
                return aminoAcids;
            }
        }
        return aminoAcids;
    }
}