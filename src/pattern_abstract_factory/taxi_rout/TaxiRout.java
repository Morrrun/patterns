package pattern_abstract_factory.taxi_rout;

import pattern_abstract_factory.abstract_factory.LengthCalculator;
import pattern_abstract_factory.abstract_factory.Route;

import java.awt.Point;
import java.util.List;

public class TaxiRout extends Route {

    private double averageSpeed;
    private static final double taxiSpeedCoeff = 0.7;

    private double costPerKm;
    private double costPerMinute;

    public TaxiRout(List<Point> points) {
        super(points);
    }

    public double calculateCost() {
        return Math.min(
                costPerKm * calculateLength(),
                costPerKm * calculateDuration());
    }

    @Override
    public double calculateDuration() {
        return (calculateLength() / averageSpeed);
    }

    @Override
    public double calculateLength() {
        double totalLength = 0;

        for (int i = 0; i < points.size() - 1; i++) {
            totalLength += LengthCalculator.getLength(
                    points.get(i),
                    points.get(i + 1)
            );
        }

        return totalLength * taxiSpeedCoeff;
    }

    public void setAverageSpeed(double averageSpeed) {
        this.averageSpeed = averageSpeed;
    }

    public void setCostPerKm(double costPerKm) {
        this.costPerKm = costPerKm;
    }

    public void setCostPerMinute(double costPerMinute) {
        this.costPerMinute = costPerMinute;
    }

    public double getAverageSpeed() {
        return averageSpeed;
    }

    public double getCostPerKm() {
        return costPerKm;
    }

    public double getCostPerMinute() {
        return costPerMinute;
    }
}