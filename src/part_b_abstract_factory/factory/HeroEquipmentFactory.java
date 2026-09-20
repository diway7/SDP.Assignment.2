package part_b_abstract_factory.factory;

import part_b_abstract_factory.model.Armor;
import part_b_abstract_factory.model.Weapon;

public interface HeroEquipmentFactory {
    Weapon createWeapon();
    Armor createArmor();
}