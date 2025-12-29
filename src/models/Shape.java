package models;

public class Shape {

    private Point[] points;
    private int size;

    public Shape() {
        points = new Point[4];   // initial capacity
        size = 0;
    }

    public void addPoint(Point p) {
        if (size == points.length) {
            resize();
        }
        points[size++] = p;
    }

    private void resize() {
        Point[] newArr = new Point[points.length * 2];
        for (int i = 0; i < points.length; i++) {
            newArr[i] = points[i];
        }
        points = newArr;
    }

    public double calculatePerimeter() {
        if (size < 2) return 0;

        double sum = 0;
        for (int i = 0; i < size; i++) {
            Point current = points[i];
            Point next = points[(i + 1) % size];
            sum += current.distance(next);
        }
        return sum;
    }

    public double getAverageSide() {
        if (size < 2) return 0;
        return calculatePerimeter() / size;
    }

    public double getLongest() {
        if (size < 2) return 0;

        double max = 0;

        for (int i = 0; i < size; i++) {
            double dist = points[i].distance(points[(i + 1) % size]);
            if (dist > max) {
                max = dist;
            }
        }
        return max;
    }
}