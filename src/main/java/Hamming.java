class Hamming {

    private String leftStrand;
    private String rightStrand;

    Hamming(String leftStrand, String rightStrand) {
        if (leftStrand.length() != rightStrand.length()) {
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }
        this.leftStrand = leftStrand;
        this.rightStrand = rightStrand;
    }

    int getHammingDistance() {
        char[] leftArr = leftStrand.toCharArray();
        char[] rightArr = rightStrand.toCharArray();
        int distance = 0;
        for (int i = 0; i < leftArr.length; i++) {
            if (leftArr[i] != rightArr[i]) {
                distance++;
            }
        }
        return distance;
    }
}
