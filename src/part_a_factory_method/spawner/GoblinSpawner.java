package part_a_factory_method.spawner;
import part_a_factory_method.model.Enemy;
import part_a_factory_method.model.Goblin;

public class GoblinSpawner extends EnemySpawner{
    @Override
    public Enemy createEnemy(){
        return new Goblin();
    }
}