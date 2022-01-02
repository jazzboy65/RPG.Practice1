package server;

public class Server {
    private static Server instance = null;
    /**
     * Singleton - паттерн, который гарантирует, что объект будет существовать только в единственном экземпляре
     * Правила реализации паттерна Singleton:
     * 1) Приватный конструктор
     * 2) Статичный метод getInstance (возвращает новый объект если он не существует, иначе возвращает уже созданный
     *
     */

    private Server() {

    }

    public static Server getInstance() {
        if (instance == null) {
            instance = new Server();
        } return instance;
    }
}
