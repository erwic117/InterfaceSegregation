package com.erwic.interfacesegregation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class ProductionPlace {
    private ProductionManager productionManager = new ProductionManager();
    private Human human = new Human("Paul");
    private Robot robot = new Robot("r1");

    private Manageable managee;

    @PostConstruct
    public void init() {
        human.getManaged(productionManager);
        robot.getManaged(productionManager);

        // shows how managee can be managed by productionManager regardless of implementation
        managee = robot;
        managee.getManaged(productionManager);
    }
}
