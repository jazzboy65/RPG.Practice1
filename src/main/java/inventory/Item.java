package inventory;

public class Item {
    private String name;
    private int price;
    private final ItemType type;

    public Item(String name, int price, ItemType type) {
        this.name = name;
        this.price = price;
        this.type = type;
    }

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
        this.type = ItemType.NONE;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public ItemType getType() {
        return type;
    }

    /**
     * 4 правила для реализации паттерна Builder:
     * 1) Builder содержит такие же поля как и у самого класса, который мы строим
     * 2) Методы установки полей (set, with, без префиксов) должны возвращать обьект Builder
     * 3) Пустой конструктор и метод Build, который возвращает объект основного класса
     * 4) Builder должен быть статичным, внутренним классом
     *
     * Если в классе больше  ~ 10 полей, то желательно использовать Builder
     */

    public static class Builder{
        private String name;
        private int price;
        private ItemType type;

        public Builder() {

        }
        public Builder name (String name) {
            this.name = name;
            return this;
        }
        public Builder price(int price) {
            this.price = price;
            return this;
        }
        public Builder type(ItemType type) {
            this.type = type;
            return this;
        }

        public Item build () {
            return new Item(name,price,type);
        }


    }

}



