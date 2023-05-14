package pattern_factory.figure;

import java.awt.*;

public class Line implements Figure {
    private final Point x;
    private final Point y;
    public Line(Point x, Point y) {
        this.x = x;
        this.y = y;
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
