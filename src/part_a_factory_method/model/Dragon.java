package src.part_a_factory_method.model;

public class Dragon implements Enemy{
    @Override
    public void attack(){
        System.out.println("drakon tsarevich");
    }
    @Override
    public void move(){
        System.out.println("dragon move back");
    }
}
