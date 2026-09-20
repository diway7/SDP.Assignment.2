package src.part_a_factory_method.model;

public class Goblin implements Enemy{
    @Override
    public void attack(){
        System.out.println("gonlin is imba");
    }
    @Override
    public void move(){
        System.out.println("goblin run");
    }
}
