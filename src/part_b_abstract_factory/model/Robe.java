package part_b_abstract_factory.model;

public class Robe implements Armor {
    @Override
    public void equip() {
        System.out.println("+50 mana, +10 defense).");
    }
}