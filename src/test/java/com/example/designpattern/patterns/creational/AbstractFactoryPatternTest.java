package com.example.designpattern.patterns.creational;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbstractFactoryPatternTest {

    @DisplayName("추상 팩토리 패턴 테스트")
    @Nested
    class AbstractFactory {

        @DisplayName("ConcreteFactory1 객체를 통한 객체 생성 테스트")
        @Test
        void testConcreteFactory1() {
            // Arrange
            AbstractFactoryPattern.AbstractFactory factory = new AbstractFactoryPattern.ConcreteFactory1();

            // Act
            AbstractFactoryPattern.ProductA productA = factory.createProductA();
            AbstractFactoryPattern.ProductB productB = factory.createProductB();

            // Assert
            assertTrue(productA instanceof AbstractFactoryPattern.ConcreteProductA1);
            assertTrue(productB instanceof AbstractFactoryPattern.ConcreteProductB1);

            productA.createA();
            productB.createB();
        }

        @DisplayName("ConcreteFactory2 객체를 통한 객체 생성 테스트")
        @Test
        void testConcreteFactory2() {
            // Arrange
            AbstractFactoryPattern.AbstractFactory factory = new AbstractFactoryPattern.ConcreteFactory2();

            // Act
            AbstractFactoryPattern.ProductA productA = factory.createProductA();
            AbstractFactoryPattern.ProductB productB = factory.createProductB();

            // Assert
            assertTrue(productA instanceof AbstractFactoryPattern.ConcreteProductA2);
            assertTrue(productB instanceof AbstractFactoryPattern.ConcreteProductB2);

            productA.createA();
            productB.createB();
        }
    }
}