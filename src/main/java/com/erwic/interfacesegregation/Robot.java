package com.erwic.interfacesegregation;

import com.erwic.interfacesegregation.work.Workable;

public class Robot implements Workable, Manageable {
    private String id;

    public Robot(String id) {
        this.id = id;
    }

    @Override
    public void work() {
        System.out.println("Working...");
    }

    @Override
    public void getManaged(Manager manager) {
        manager.manageRobot(this);
    }
}
