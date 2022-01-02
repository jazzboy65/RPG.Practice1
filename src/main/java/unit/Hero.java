package unit;

public class Hero extends Unit {
    public String name;
    public String speciality;
    private int dexterity;


    public Hero(String name, String speciality) {
        super(50, 50, 50);
        this.name = name;
        this.speciality = speciality;
        this.dexterity = 50;
    }

    @Override
    public void postAttack(Unit target) {
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public static class Builder {

        private String name;
        private String speciality;
        private int dexterity;

        public Builder() {
        }


        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder speciality(String speciality) {
            this.speciality = speciality;
            return this;
        }

        public Builder dexterity(int dexterity) {
            this.dexterity = dexterity;
            return this;
        }


        public Hero build() {
            Hero hero1 = new Hero(name, speciality);
            hero1.setDexterity(dexterity);
            return hero1;

        }
    }
}



