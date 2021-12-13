import inventory.Arrows;
import inventory.Weapon;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runners.JUnit4;
import unit.Enemy;
import unit.Hero;
import unit.RangeUnit;

public class InventoryTest {


    @Test
    public void whenUnitAttackCheckArrowsCount() {
        Enemy unit1 = new Enemy("demon","goblin",10,10,10);
        Hero hero1 = new Hero("ivan","warrior");
        unit1.getInventory().addItem(new Arrows("Bow",1));
        unit1.attack(hero1);
        Assert.assertEquals(29,unit1.findArrows().get().getCount());
    }
    @Test
    public void whenRangeUnitAttackShouldRemoveArrow() {

        Enemy unit1 = new Enemy("animal","snake boss",500,500,100);
        RangeUnit hero1 = new RangeUnit(10,10,10,10);
        hero1.getInventory().addItem(new Arrows("arrows",10));
        hero1.move(5,5);
        unit1.move(10,10);
        Assert.assertTrue(hero1.checkAttackAvailable(unit1));
        for (int i = 0; i < 30; i++) {
            hero1.attack(unit1);
        }
        Assert.assertFalse(hero1.checkAttackAvailable(unit1));
    }

    @Test
    public void whenRangeUnitAttackCheckRadius() {

        Enemy unit1 = new Enemy("demon","imp",10,10,10);
        RangeUnit hero1 = new RangeUnit(10,10,10,10);
        hero1.getInventory().addItem(new Arrows("arrows",10));
        hero1.move(3,3);
        unit1.move(14,14);
        hero1.attack(unit1);
        Assert.assertEquals(10, unit1.getHealth());
    }
}


