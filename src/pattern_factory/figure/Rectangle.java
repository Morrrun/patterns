package pattern_factory.figure;

import java.awt.*;

public class Rectangle implements Figure {
    private final Point a;
    private final Point b;
    private final Point c;
    private final Point d;
    public Rectangle(Point a, Point b, Point c, Point d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
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
