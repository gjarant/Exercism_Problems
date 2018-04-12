class Scrabble {

    private String word;

    Scrabble(String word) {
        this.word = word;
    }

    int getScore() {
        String upper = this.word.toUpperCase();
        char[] wordInChars = upper.toCharArray();
        int score = 0;
        for(int i = 0; i < wordInChars.length; i++){

            if(wordInChars[i] =='A' ||
                    wordInChars[i] =='E' ||
                    wordInChars[i] == 'I' ||
                    wordInChars[i] == 'O' ||
                    wordInChars[i] == 'U' ||
                    wordInChars[i] == 'L' ||
                    wordInChars[i] == 'N' ||
                    wordInChars[i] == 'R' ||
                    wordInChars[i] == 'S' ||
                    wordInChars[i] =='T'  ){
                score += 1;
            } else if(wordInChars[i] =='D' ||
                    wordInChars[i] =='G' ){
                score+=2;
            } else if(wordInChars[i] =='B' ||
                    wordInChars[i] =='C' ||
                    wordInChars[i] =='M' ||
                    wordInChars[i] =='P' ){
                score+=3;
            } else if(wordInChars[i] =='F' ||
                    wordInChars[i] =='H' ||
                    wordInChars[i] =='V' ||
                    wordInChars[i] =='W' ||
                    wordInChars[i] =='Y'){
                score+=4;
            } else if(wordInChars[i] =='K'){
                score+=5;
            } else if(wordInChars[i] =='J' ||
                    wordInChars[i] =='X' ){
                score+=8;
            } else if(wordInChars[i] =='Q' ||
                    wordInChars[i] =='Z' ){
                score+=10;
            }

        }
        return score;
    }

}
