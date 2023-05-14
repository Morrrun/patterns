package pattern_abstract_factory.car_rout;

import pattern_abstract_factory.abstract_factory.Route;
import pattern_abstract_factory.abstract_factory.RouteAbstractFactory;

import java.awt.Point;
import java.util.List;

public class CarRoutFactory implements RouteAbstractFactory {
    private final List<Point> points;

    public CarRoutFactory(List<Point> points) {
        this.points = points;
    }

    @Override
    public Route createRout() {
        return new CarRoute(points);
    }
}
