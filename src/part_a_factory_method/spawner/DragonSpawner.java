package part_a_factory_method.spawner;
import part_a_factory_method.model.Dragon;
import part_a_factory_method.model.Enemy;
public class DragonSpawner extends EnemySpawner{
    @Override
    public Enemy createEnemy(){
        return new Dragon();
    }
}