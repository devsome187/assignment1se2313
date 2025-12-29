package models;

public class Point {
    private double x;
    private double y;

    public Point(){
        this.x = 0;
        this.y = 0;
    }

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX(){
        return x;
    }

    public double  getY(){
        return y;
    }

    public double distance(Point q){
        double dx = x - q.x;
        double dy = y - q.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    @Override
    public String toString(){
        return "(" + x + ";" + y + ")";
    }
}
