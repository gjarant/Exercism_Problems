class Proverb {

    private String[] words;

    Proverb(String[] words) {
        this.words = words;
    }

    String recite() {
        StringBuilder sb = new StringBuilder();

           if(this.words.length == 1){
               sb.append("And all for the want of a "+ this.words[0]+".");
           }
            else if(this.words.length == 2){
                sb.append("For want of a " + this.words[0]+" the "+ this.words[1]+ " was lost.\n"
                        + "And all for the want of a "+ this.words[0]+".");
            }
            else if(this.words.length == 3){
                sb.append("For want of a " + this.words[0]+" the "+ this.words[1]+ " was lost.\n"+
                        "For want of a " + this.words[1]+ " the "+ this.words[2] +" was lost.\n"
                        + "And all for the want of a "+ this.words[0]+".");
            }
            else if(this.words.length == 4){
                sb.append("For want of a " + this.words[0]+" the "+ this.words[1]+ " was lost.\n"+
                        "For want of a " + this.words[1]+ " the "+ this.words[2] +" was lost.\n"+
                        "For want of a " + this.words[2]+ " the "+ this.words[3]+ " was lost.\n"
                        + "And all for the want of a "+ this.words[0]+".");
            }
            else if(this.words.length == 5){
                sb.append("For want of a " + this.words[0]+" the "+ this.words[1]+ " was lost.\n"+
                        "For want of a " + this.words[1]+ " the "+ this.words[2] +" was lost.\n"+
                        "For want of a " + this.words[2]+ " the "+ this.words[3]+ " was lost.\n" +
                        "For want of a " + this.words[3]+ " the "+ this.words[4]+ " was lost.\n"
                        + "And all for the want of a "+ this.words[0]+".");
            }
           else if(this.words.length == 6){
               sb.append("For want of a " + this.words[0]+" the "+ this.words[1]+ " was lost.\n"+
                       "For want of a " + this.words[1]+ " the "+ this.words[2] +" was lost.\n"+
                       "For want of a " + this.words[2]+ " the "+ this.words[3]+ " was lost.\n" +
                       "For want of a " + this.words[3]+ " the "+ this.words[4]+ " was lost.\n" +
                       "For want of a " + this.words[4]+ " the "+ this.words[5]+ " was lost.\n"
                       + "And all for the want of a "+ this.words[0]+".");
           }
           else if(this.words.length == 7){
               sb.append("For want of a " + this.words[0]+" the "+ this.words[1]+ " was lost.\n"+
                       "For want of a " + this.words[1]+ " the "+ this.words[2] +" was lost.\n"+
                       "For want of a " + this.words[2]+ " the "+ this.words[3]+ " was lost.\n" +
                       "For want of a " + this.words[3]+ " the "+ this.words[4]+ " was lost.\n" +
                       "For want of a " + this.words[4]+ " the "+ this.words[5]+ " was lost.\n" +
                       "For want of a " + this.words[5]+ " the "+ this.words[6]+ " was lost.\n"
                       + "And all for the want of a "+ this.words[0]+".");
           }
        return sb.toString();
    }

    public String[] getWords() {
        return words;
    }

    public void setWords(String[] words) {
        this.words = words;
    }
}
