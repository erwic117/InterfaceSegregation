package com.erwic.interfacesegregation.food;

import java.time.LocalDate;

public class Apple extends Food {

    public Apple(int nutritionLevel, LocalDate expirationDate) {
        super(nutritionLevel, expirationDate);
    }

    @Override
    public boolean isPoisonous() {
        return false;
    }

    @Override
    public int getNutritionLevel() {
        return super.getNutritionLevel();
    }

}
