package exercise;

// BEGIN
class Cottage implements Home {
    double area;
    int floorCount;

    public Cottage(double area, int floorCount) {
        this.area = area;
        this.floorCount = floorCount;
    }

    public String toString() {
        return floorCount + " этажный коттедж площадью " + area + " метров";
    }

    @Override
    public double getArea() {
        return area;
    }

    @Override
    public int compareTo(Home another) {
        if (area == another.getArea()) {
            return 0;
        }
        return area > another.getArea() ? 1: -1;
    }
}
// END
