package com.example.designpattern.patterns.creational;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactoryMethodPatternTest {

    @DisplayName("팩토리 메소드 패턴 테스트")
    @Nested
    class FactoryMethod {

        @DisplayName("팩토리 메소드 패턴을 이용한 ConcreteProductA 객체 생성")
        @Test
        void testConcreteCreatorA() {
            // Arrange
            FactoryMethodPattern.Creator creator = new FactoryMethodPattern.ConcreteCreatorA();

            // Act
            FactoryMethodPattern.Product product = creator.factoryMethod();

            // Assert
            assertTrue(product instanceof FactoryMethodPattern.ConcreteProductA);

            product.create();
        }

        @DisplayName("팩토리 메소드 패턴을 이용한 ConcreteProductB 객체 생성")
        @Test
        void testConcreteCreatorB() {
            // Arrange
            FactoryMethodPattern.Creator creator = new FactoryMethodPattern.ConcreteCreatorB();

            // Act
            FactoryMethodPattern.Product product = creator.factoryMethod();

            // Assert
            assertTrue(product instanceof FactoryMethodPattern.ConcreteProductB);

            product.create();
        }
    }
}