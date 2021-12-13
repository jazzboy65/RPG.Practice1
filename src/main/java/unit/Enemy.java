package unit;

public class Enemy extends RangeUnit {
    public String race;
    public String variety;


    public Enemy(String race, String variety, int force, int health, int energy) {
        super(force, health, energy,10);
        this.race = race;
        this.variety = variety;
    }



    /**public unit.Enemy(int energy, int health) { //Волшебный гоблин
     this.variety = "Greedy goblin";
     this.force = 1;
     this.health = health;
     this.energy = energy;
     } */

}
