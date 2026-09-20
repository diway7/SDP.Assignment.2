package part_b_abstract_factory.model;

public class Sword implements Weapon {
    @Override
    public void use() {
        System.out.println("Swinging a Heavy Steel Sword for critical damage!");
    }
}