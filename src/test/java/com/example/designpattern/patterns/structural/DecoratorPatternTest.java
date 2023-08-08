package com.example.designpattern.patterns.structural;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * 테스트 코드에서는 MilkDecorator를 사용하여 SimpleCoffee에 우유를 추가하고, 비용과 설명이 올바르게 업데이트되는지 검증합니다.
 */
class DecoratorPatternTest {

    @Test
    void testDecoratorPattern() {
        // Arrange
        DecoratorPattern.Coffee coffee = new DecoratorPattern.SimpleCoffee();
        coffee = new DecoratorPattern.MilkDecorator(coffee);

        // Act & Assert
        assertEquals(6.0, coffee.getCost());
        assertEquals("Simple Coffee, Milk", coffee.getDescription());
    }
}