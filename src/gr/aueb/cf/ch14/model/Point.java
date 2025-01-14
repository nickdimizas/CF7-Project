package gr.aueb.cf.ch14.model;

import java.security.PrivateKey;
import java.util.Random;

public class Point {
    private int x;
    private int y;

    private Point() {

    }

    private Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static Point getInstance() {
        return new Point();
    }

    public static Point getRandomPoint() {
        Random random = new Random(System.currentTimeMillis());
        return new Point(random.nextInt(10), random.nextInt(10));
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
