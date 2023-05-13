package patternt_singleton;

/**
 * Паттерн Singleton позволяет создавать объект некоторого класса
 * в единственном экземпляре и запрещает создание новых объектов
 * этого класса
 */
public class Connection {
    private static volatile Connection instance;

    private Connection() {
    }

    public static Connection getInstance() {
        if(instance == null) {
            synchronized (Connection.class) {
                if(instance == null) {
                    instance = new Connection();
                }
            }
        }
        return instance;
    }


}
