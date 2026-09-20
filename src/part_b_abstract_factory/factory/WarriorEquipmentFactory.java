package part_b_abstract_factory.factory;

import part_b_abstract_factory.model.Armor;
import part_b_abstract_factory.model.PlateArmor;
import part_b_abstract_factory.model.Sword;
import part_b_abstract_factory.model.Weapon;

public class WarriorEquipmentFactory implements HeroEquipmentFactory {
    @Override
    public Weapon createWeapon() {
        return new Sword();
    }

    @Override
    public Armor createArmor() {
        return new PlateArmor();
    }
}