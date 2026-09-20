package src.part_a_factory_method.spawner;
import src.part_a_factory_method.model.Enemy;

public abstract class EnemySpawner {
    public abstract Enemy createEnemy();
    public void spawnAndEngage() {
        Enemy enemy = createEnemy();
        System.out.println("enemy respawm");
        enemy.attack();
        enemy.move();
    }
}
