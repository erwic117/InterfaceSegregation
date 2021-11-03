package com.erwic.interfacesegregation.food;

import java.time.LocalDate;

public abstract class Food implements Poisonous, Perishable {
    private final int nutritionLevel;
    private final LocalDate expirationDate;

    public Food(int nutritionLevel, LocalDate expirationDate) {
        this.nutritionLevel = nutritionLevel;
        this.expirationDate = expirationDate;
    };

    public int getNutritionLevel() {
        return this.nutritionLevel;
    }

    public LocalDate getExpirationDate() {
        return this.expirationDate;
    }


    @Override
    public boolean isPerished() {
        LocalDate now = LocalDate.now();

        return !expirationDate.isAfter(now);
    }
}
