package pattern_factory.figure;

import java.awt.*;
import java.util.List;

public class Hexagon implements Figure {
    private final List<Point> points;
    public Hexagon(List<Point> points) {
        this.points = points;
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
