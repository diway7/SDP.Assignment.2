package part_b_abstract_factory.model;

public class PlateArmor implements Armor {
    @Override
    public void equip() {
        System.out.println("+100 defense, -10 speed");
    }
}