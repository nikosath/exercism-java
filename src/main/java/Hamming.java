import java.util.stream.IntStream;

class Hamming {

    private final String leftStrand;
    private final String rightStrand;

    Hamming(String leftStrand, String rightStrand) {
        if (leftStrand.length() != rightStrand.length()) {
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }
        this.leftStrand = leftStrand;
        this.rightStrand = rightStrand;
    }

    int getHammingDistanceORG() {
        int distance = 0;
        for (int i = 0; i < leftStrand.length(); i++) {
            if (leftStrand.charAt(i) != rightStrand.charAt(i)) {
                distance++;
            }
        }
        return distance;
    }

    int getHammingDistance() {
        return (int) IntStream.range(0, leftStrand.length())
                            .filter(i -> leftStrand.charAt(i) != rightStrand.charAt(i))
                            .count();
    }

}
