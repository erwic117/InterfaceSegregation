package com.erwic.interfacesegregation.food;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class FoodTest {

    LocalDate expirationDate = LocalDate.parse("2021-12-31");
    Apple apple = new Apple(10, expirationDate);

    @Test
    void isPerished() {
        assertThat(apple.isPerished()).isFalse();
    }
}