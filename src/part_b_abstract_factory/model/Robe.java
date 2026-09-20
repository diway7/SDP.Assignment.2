package part_b_abstract_factory.model;

public class Robe implements Armor {
    @Override
    public void equip() {
        System.out.println("Equipping Arcane Robe (+50 Mana, +10 Defense).");
    }
}