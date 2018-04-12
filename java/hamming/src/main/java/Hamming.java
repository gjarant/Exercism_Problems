class Hamming {
    private String leftStrand;
    private String rightStrand;


    Hamming(String leftStrand, String rightStrand) {
        this.leftStrand = leftStrand;
        this.rightStrand = rightStrand;
        if (this.rightStrand.length() != this.leftStrand.length()) {
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }
    }

    int getHammingDistance() {
        int count = 0;
        for (int i = 0; i < this.rightStrand.length(); i++) {
            if (this.rightStrand.charAt(i) != this.leftStrand.charAt(i)) {
                count++;

            }
        }
        return count;
    }
}