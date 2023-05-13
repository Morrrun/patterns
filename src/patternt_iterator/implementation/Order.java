package patternt_iterator.implementation;

public class Order {
    private DeliveryType deliveryType;
    private int price;

    public Order(int price, DeliveryType deliveryType) {
        this.deliveryType = deliveryType;
        this.price = price;
    }

    public DeliveryType getDeliveryType() {
        return deliveryType;
    }

    public void setDeliveryType(DeliveryType deliveryType) {
        this.deliveryType = deliveryType;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Order:\n" +
               "    deliveryType=" + deliveryType + "\n" +
               "    price=" + price;
    }
}
