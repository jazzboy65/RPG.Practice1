package unit;

public class Hero extends Unit {
    public String name;
    public String speciality;
    public int dexterity;


    public Hero(String name, String speciality) {
        super(50, 50, 50);
        this.name = name;
        this.speciality = speciality;
        this.dexterity = 50;
    }

    @Override
    public void postAttack(Unit target) {
    }
}
