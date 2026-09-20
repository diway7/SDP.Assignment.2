package part_b_abstract_factory.model;

public class PlateArmor implements Armor {
    @Override
    public void equip() {
        System.out.println("Equipping Heavy Plate Armor (+100 Defense, -10 Speed).");
    }
}