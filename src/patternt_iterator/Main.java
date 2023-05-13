package patternt_iterator;

import patternt_iterator.implementation.DeliveryType;
import patternt_iterator.iterator.Iterator;
import patternt_iterator.implementation.Order;
import patternt_iterator.implementation.OrderCollection;
import patternt_iterator.implementation.OrderCollectionImpl;

public class Main {
    private static final OrderCollection orders = new OrderCollectionImpl();

    static {
        orders.addOrder(new Order(5670, DeliveryType.AIRPLANE));
        orders.addOrder(new Order(4637, DeliveryType.AIRPLANE));
        orders.addOrder(new Order(322, DeliveryType.BICYCLE_COURIER));
        orders.addOrder(new Order(331, DeliveryType.PEDESTRIAN_COURIER));
        orders.addOrder(new Order(905, DeliveryType.PICKUP));
        orders.addOrder(new Order(37881, DeliveryType.AIRPLANE));
        orders.addOrder(new Order(896, DeliveryType.TRUCK));
        orders.addOrder(new Order(56, DeliveryType.PICKUP));
    }
    public static void main(String[] args) {
        Iterator orderIterator = orders.iterator(DeliveryType.ALL);
        while (orderIterator.hasNext()) {
            Order order = orderIterator.next();
            System.out.println(order);
        }
    }
}
