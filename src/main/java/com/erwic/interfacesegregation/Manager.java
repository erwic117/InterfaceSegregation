package com.erwic.interfacesegregation;

import com.erwic.interfacesegregation.food.Feedable;
import com.erwic.interfacesegregation.work.Workable;

public interface Manager {
    void manageHuman(Human human);
    void manageRobot(Robot robot);
}
