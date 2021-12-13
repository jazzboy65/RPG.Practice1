package main;

import unit.interfaces.Movable;

public class Main1 {
    public static void main(String[] args) {
        /** Если это люмбда выражение, то интерфейс должен быть функциональным,
         * т.е. содержать одну функцию, иначе java не будет понимать какую функцию вызывать
         */

        Movable m = (x, y) -> {
            System.out.println(x+y);
        };
        m.move(3,2);
    }
}
