package pattern_factory.figure;

import java.awt.Point;
import java.util.List;

public class FigureFactory {
    public static <T extends Figure> T createFigure(List<Point> points) {
        int pointsCount = points.size();
        if(pointsCount < 2) {
            throw new IllegalArgumentException("Точек должно быть больше 2-х");
        }
        switch (pointsCount) {
            case 2:
                return (T) new Line(points.get(0), points.get(1));
            case 3:
                return (T) new Triangle(points.get(0), points.get(1), points.get(2));
            case 4:
                return (T) new Rectangle(
                        points.get(0),
                        points.get(1),
                        points.get(2),
                        points.get(3));
            case 5:
                return (T) new Pentagon(points);
            case 6:
                return (T) new Hexagon(points);
            default:
                return (T) new Polygon(points);
        }
    }
}
