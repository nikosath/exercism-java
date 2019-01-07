class RaindropConverter {

    String convert(int number) {
        StringBuilder builder = new StringBuilder();

        for (RainDrop drop : RainDrop.values()) {
            if (drop.hasPrimeFactor(number)) {
                builder.append(drop);
            }
        }
        
        return builder.length() > 0 ? builder.toString() : String.valueOf(number);
    }

    private enum RainDrop {
        Pling(3), Plang(5), Plong(7);

        private int primeFactor;

        private RainDrop(int primeFactor) {
            this.primeFactor = primeFactor;
        }

        public boolean hasPrimeFactor(int number) {
            return number % primeFactor == 0;
        }
    }

}
