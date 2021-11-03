package com.erwic.interfacesegregation;

import com.erwic.interfacesegregation.food.Feedable;
import com.erwic.interfacesegregation.food.Food;
import com.erwic.interfacesegregation.food.PowerLevel;
import com.erwic.interfacesegregation.work.Workable;

public class Human implements Feedable, Workable, Manageable {
    private String name;
    private PowerLevel powerLevel;

    public Human(String name) {
        this.name = name;
        this.powerLevel = new PowerLevel(100);
    }

    @Override
    public void eat(Food food) {
        if (food.isPerished()) {
            this.powerLevel.decrease(10);
            System.out.println("Has eaten bad food, -10 PL.");
            return;
        }

        int foodPowerLevel = food.getNutritionLevel();

        this.powerLevel.increase(foodPowerLevel);

        System.out.println("Has eaten, +" + foodPowerLevel + " PL.");

    }

    @Override
    public void work() {
        System.out.println("Working..., -10 PL.");
        this.powerLevel.decrease(10);
    }

    @Override
    public void getManaged(Manager manager) {
        manager.manageHuman(this);
    }
}
