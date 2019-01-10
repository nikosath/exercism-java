class Darts {
    private double x;
    private double y;

    Darts(double x, double y) {
        this.x = x;
        this.y = y;
    }

    int score() {
        double radius = Math.sqrt(x*x + y*y);
        for (CircleArea area : CircleArea.values()) {
            if (area.hasRadius(radius)) {
                return area.getPointsAwarded();
            }
        }
        return 0;
    }
}

enum CircleArea {
    INNER(1, 10),
    MIDDLE(5, 5),
    OUTER(10, 1);

    private double radius;
    private int pointsAwarded;

    CircleArea(double radius, int pointsAwarded) {
        this.radius = radius;
        this.pointsAwarded = pointsAwarded;
    }

    public int getPointsAwarded() {
        return pointsAwarded;
    }

    public boolean hasRadius(double radius) {
        return radius <= this.radius;
    }
}
