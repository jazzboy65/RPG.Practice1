package main;

import unit.Hero;

public class HeroBuilder {
    public static void main(String[] args) {
        Hero.Builder builder = new Hero.Builder();
        Hero hero = builder
                .name("Ivan")
                .speciality("Paladin")
                .dexterity(51)
                .build();
        System.out.println("Имя героя " + hero.name);
        System.out.println("Специальность героя - " + hero.speciality);
        System.out.println("Начальные параметры героя: ");
        System.out.println("Сила:" + hero.getForce());
        System.out.println("Здоровье:" + hero.getHealth());
        System.out.println("Энергия:" + hero.getEnergy());
    }
}
