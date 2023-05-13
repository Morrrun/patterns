package patternt_iterator.implementation;

import patternt_iterator.iterator.Iterator;

public interface OrderCollection {

    void addOrder(Order order);
    void removeOrder(Order order);
    Iterator iterator(DeliveryType type);
}
