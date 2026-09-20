package part_b_abstract_factory.model;

public class Wand implements Weapon {
    @Override
    public void use() {
        System.out.println("Casting a powerful Magic Missile with the Magic Wand!");
    }
}