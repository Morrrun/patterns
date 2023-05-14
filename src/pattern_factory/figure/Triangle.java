package pattern_factory.figure;

import java.awt.*;

public class Triangle implements Figure {
    private final Point a;
    private final Point b;
    private final Point c;
    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double calculatePerimeter() {
        return 0;
    }

    @Override
    public double calculateSquare() {
        return 0;
    }

    @Override
    public double getWidth() {
        return 0;
    }

    @Override
    public double getHeight() {
        return 0;
    }
}
