package patternt_singleton;

public class Main {
    public static void main(String[] args) {
        Connection connectionFirst = Connection.getInstance();
        Connection connectionSecond = Connection.getInstance();

        System.out.println(connectionFirst == connectionSecond);
    }
}
