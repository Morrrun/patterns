package pattern_abstract_factory.abstract_factory;

public class RoutFactory {
    public static Route getRoute(RouteAbstractFactory factory) {
        return factory.createRout();
    }
}
