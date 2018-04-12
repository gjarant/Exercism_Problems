class Acronym {

    private String phrase;

    Acronym(String phrase) {
        this.phrase = phrase;
    }

    String get() {
        String[] wordSplit = phrase.split("[-\\s]");
        String acronym ="";
        for(int i = 0; i < wordSplit.length; i++){
            acronym += wordSplit[i].substring(0,1).toUpperCase();
        }

        return acronym;
    }
}
