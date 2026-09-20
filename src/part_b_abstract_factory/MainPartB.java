package part_b_abstract_factory;

import part_b_abstract_factory.client.GameHero;
import part_b_abstract_factory.factory.HeroEquipmentFactory;
import part_b_abstract_factory.factory.MageEquipmentFactory;
import part_b_abstract_factory.factory.WarriorEquipmentFactory;

public class MainPartB {
    public static void main(String[] args) {
        System.out.println("=== Initializing Mage Hero ===");
        HeroEquipmentFactory mageFactory = new MageEquipmentFactory();
        GameHero mage = new GameHero(mageFactory);
        mage.prepareForBattle();

        System.out.println("\n=== Initializing Warrior Hero ===");
        HeroEquipmentFactory warriorFactory = new WarriorEquipmentFactory();
        GameHero warrior = new GameHero(warriorFactory);
        warrior.prepareForBattle();
    }
}