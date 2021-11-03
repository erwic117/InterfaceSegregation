package com.erwic.interfacesegregation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class ProductionPlace {
    private ProductionManager productionManager = new ProductionManager();
    private Human human = new Human("Paul");
    private Robot robot = new Robot("r1");

    @PostConstruct
    public void init() {
        productionManager.manageHuman(human);
        productionManager.manageRobot(robot);
    }
}
