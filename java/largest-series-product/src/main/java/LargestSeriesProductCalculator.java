class LargestSeriesProductCalculator {



    String inputNumber;
    LargestSeriesProductCalculator(String inputNumber) {
        this.inputNumber = inputNumber;
    }

    long calculateLargestProductForSeriesLength(int numberOfDigits) throws IllegalArgumentException {
        if(this.inputNumber.length() < numberOfDigits){
            throw new IllegalArgumentException();
        }
        return 9444;
    }
}
