package part_b_abstract_factory.client;

import part_b_abstract_factory.factory.HeroEquipmentFactory;
import part_b_abstract_factory.model.Armor;
import part_b_abstract_factory.model.Weapon;

public class GameHero {
    private final Weapon weapon;
    private final Armor armor;

    // Клиент работает ТОЛЬКО через абстрактные интерфейсы
    public GameHero(HeroEquipmentFactory factory) {
        this.weapon = factory.createWeapon();
        this.armor = factory.createArmor();
    }

    public void prepareForBattle() {
        armor.equip();
        weapon.use();
    }
}