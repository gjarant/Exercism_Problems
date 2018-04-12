class NaturalNumber {

    private Integer number;

    public NaturalNumber(Integer number) throws IllegalArgumentException {
        this.number = number;
        if(this.number <= 0){
            throw new IllegalArgumentException("You must supply a natural number (positive integer)");
        }
    }

    public Classification getClassification() {
        if(numberToCompare(this.number).equals(this.number)) {
            return Classification.PERFECT;
        } else if(numberToCompare(this.number) > this.number ){
            return Classification.ABUNDANT;
        } else if(numberToCompare(this.number) < this.number ){
            return Classification.DEFICIENT;
        }
        return null;
    }

    public Integer numberToCompare(int n) {
        int result = 0;

        for(int i = 1; i < n; i++){
            if (n % i ==0){
                result += i;
            };
        }
        return result;
    }


}
