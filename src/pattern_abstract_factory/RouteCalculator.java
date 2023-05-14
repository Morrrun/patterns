package pattern_abstract_factory;

import pattern_abstract_factory.car_rout.CarRoutFactory;
import pattern_abstract_factory.abstract_factory.RoutFactory;
import pattern_abstract_factory.abstract_factory.Route;
import pattern_abstract_factory.taxi_rout.TaxiRoutFactory;

import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

public class RouteCalculator {

    public static void main(String[] args) {
        List<Point> points = new ArrayList<>();
        points.add(new Point(1232344, -21312));
        points.add(new Point(123445, 124532));

        Route carRoute = RoutFactory
                .getRoute(new CarRoutFactory(points));

        Route taxiRoute = RoutFactory
                .getRoute(new TaxiRoutFactory(points, 15, 20));

        System.out.println("Car route duration: " +
                           carRoute.calculateDuration() + " minutes");

        System.out.println("Taxi route duration: " +
                           taxiRoute.calculateDuration() + " minutes");
    }
}
