package com.erwic.interfacesegregation.food;

public class PowerLevel {
    private int level;

    public PowerLevel(int level) {
        this.level = level;
    }

    public int increase(int level) {
        if (level < 0) return level;
        this.level += level;
        return level;
    }

    public int decrease(int level) {
        if (level > 0) return level;
        this.level -= level;

        if (this.hasNoPower()) System.out.println("NO MORE POWER");

        return level;
    }

    public int getPowerLevel() {
        return level;
    }

    private boolean hasNoPower() {
        return level <= 0;
    }
}
