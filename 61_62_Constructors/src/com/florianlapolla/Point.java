package com.florianlapolla;

public class Point {

    private int x;
    private int y;

    public Point() {

    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y){
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public double distance() {
        return distance(0, 0);
    }

    public double distance(int x, int y) {
        double xDiff = this.x - x;
        double yDiff = this.y - y;
        return Math.sqrt((xDiff * xDiff) +(yDiff * yDiff));
    }

    public double distance(Point point) {
        return distance(point.x, point.y);
    }

}
