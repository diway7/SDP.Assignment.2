package part_b_abstract_factory.factory;

import part_b_abstract_factory.model.Armor;
import part_b_abstract_factory.model.Robe;
import part_b_abstract_factory.model.Wand;
import part_b_abstract_factory.model.Weapon;

public class MageEquipmentFactory implements HeroEquipmentFactory {
    @Override
    public Weapon createWeapon() {
        return new Wand();
    }

    @Override
    public Armor createArmor() {
        return new Robe();
    }
}