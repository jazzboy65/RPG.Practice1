package main;

import inventory.Item;
import inventory.ItemType;
import inventory.Weapon;
import server.Server;
import unit.Hero;

public class Main2 {
    public static void main(String[] args) {
        Item.Builder builder = new Item.Builder();
        Item item = builder
                .name("Sword")
                .price(35)
                //.type(ItemType.WEAPON)
                .build();
        Item item2 = builder.build();
        Server server1 = Server.getInstance();
        System.out.println(server1);
        Server server2 = Server.getInstance();
        System.out.println(server2);
        Server server3 = Server.getInstance();
        System.out.println(server3);
    }
}

