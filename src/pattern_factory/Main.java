package pattern_factory;

import pattern_factory.figure.FigureFactory;
import pattern_factory.figure.Hexagon;
import pattern_factory.figure.Line;
import pattern_factory.figure.Pentagon;
import pattern_factory.figure.Polygon;
import pattern_factory.figure.Rectangle;
import pattern_factory.figure.Triangle;

import java.awt.Point;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Point> linePoints = List.of(
                new Point(12, 23),
                new Point(2, 32));

        List<Point> trianglePoints = List.of(
                new Point(12, 23),
                new Point(2, 32),
                new Point(11, 3));

        List<Point> rectanglePoints = List.of(
                new Point(12, 23),
                new Point(17, 12),
                new Point(54, 3),
                new Point(9, 32));

        List<Point> pentagonPoints = List.of(
                new Point(12, 23),
                new Point(13, 52),
                new Point(17, 2),
                new Point(14, 3),
                new Point(9, 30));

        List<Point> hexagonPoints = List.of(
                new Point(12, 23),
                new Point(13, 52),
                new Point(17, 2),
                new Point(11, 23),
                new Point(14, 3),
                new Point(9, 30));

        List<Point> polygonPoints = List.of(
                new Point(12, 23),
                new Point(13, 52),
                new Point(13, 52),
                new Point(17, 2),
                new Point(11, 23),
                new Point(14, 3),
                new Point(9, 30));

        Line line = FigureFactory.createFigure(linePoints);
        Triangle triangle = FigureFactory.createFigure(trianglePoints);
        Rectangle rectangle = FigureFactory.createFigure(rectanglePoints);
        Pentagon pentagon = FigureFactory.createFigure(pentagonPoints);
        Hexagon hexagon = FigureFactory.createFigure(hexagonPoints);
        Polygon polygon = FigureFactory.createFigure(polygonPoints);
    }
}
