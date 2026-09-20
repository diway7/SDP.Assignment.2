package part_a_factory_method;

import part_a_factory_method.spawner.DragonSpawner;
import part_a_factory_method.spawner.EnemySpawner;
import part_a_factory_method.spawner.GoblinSpawner;

public class MainPartA {
    public static void main(String[] args) {
        EnemySpawner goblinSpawner = new GoblinSpawner();
        goblinSpawner.spawnAndEngage();
        System.out.println();
        EnemySpawner dragonSpawner = new DragonSpawner();
        dragonSpawner.spawnAndEngage();
    }
}