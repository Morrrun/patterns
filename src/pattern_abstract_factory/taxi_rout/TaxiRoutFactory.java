package pattern_abstract_factory.taxi_rout;

import pattern_abstract_factory.abstract_factory.Route;
import pattern_abstract_factory.abstract_factory.RouteAbstractFactory;
import pattern_abstract_factory.abstract_factory.SpeedProvider;

import java.awt.*;
import java.util.List;

public class TaxiRoutFactory implements RouteAbstractFactory {
    private final List<Point> points;
    private final double costPerKm;
    private final double costPerMinute;

    public TaxiRoutFactory(List<Point> points, double costPerKm, double costPerMinute) {
        this.points = points;
        this.costPerKm = costPerKm;
        this.costPerMinute = costPerMinute;
    }

    @Override
    public Route createRout() {
        TaxiRout rout = new TaxiRout(points);
        rout.setCostPerKm(costPerKm);
        rout.setCostPerMinute(costPerMinute);
        rout.setAverageSpeed(SpeedProvider.getSpeed(
                points.get(0),
                points.get(points.size() - 1)
        ));
        return rout;
    }
}
