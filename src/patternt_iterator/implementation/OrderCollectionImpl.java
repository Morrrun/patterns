package patternt_iterator.implementation;

import patternt_iterator.exception.NoSuchElementException;
import patternt_iterator.iterator.Iterator;

import java.util.ArrayList;
import java.util.List;

public class OrderCollectionImpl implements OrderCollection{
    private List<Order> orders;

    public OrderCollectionImpl() {
        this.orders = new ArrayList<>();
    }


    @Override
    public void addOrder(Order order) {
        this.orders.add(order);
    }

    @Override
    public void removeOrder(Order order) {
        this.orders.remove(order);
    }

    @Override
    public Iterator iterator(DeliveryType type) {
        return new OrderIterator(type);
    }

    private class OrderIterator implements Iterator {

        private DeliveryType type;
        private int position = 0;

        public OrderIterator(DeliveryType type) {
            this.type = type;
        }

        @Override
        public boolean hasNext() {
            for (int i = position; i < orders.size(); i++) {
                Order order = orders.get(i);
                if (order.getDeliveryType().equals(type) ||
                    type.equals(DeliveryType.ALL)) {
                    return true;
                }
            }
            return false;
        }

        @Override
        public Order next() {
            while (position < orders.size()) {
                Order order = orders.get(position++);
                if (order.getDeliveryType().equals(type) ||
                    type.equals(DeliveryType.ALL)) {
                    return order;
                }
            }
            throw new NoSuchElementException();
        }
    }
}
