package com.erwic.interfacesegregation;

import com.erwic.interfacesegregation.food.Apple;

import java.time.LocalDate;

public class ProductionManager implements Manager {

    @Override
    public void manageHuman(Human human) {
        LocalDate expirationDate = LocalDate.parse("2021-12-31");
        Apple apple = new Apple(10, expirationDate);

        human.eat(apple);

        human.work();
    }

    @Override
    public void manageRobot(Robot robot) {
        robot.work();
    }
}
