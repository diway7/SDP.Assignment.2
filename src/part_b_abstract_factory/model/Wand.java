package part_b_abstract_factory.model;

public class Wand implements Weapon {
    @Override
    public void use() {
        System.out.println("casting a powerful magic missile with the magic wand!");
    }
}