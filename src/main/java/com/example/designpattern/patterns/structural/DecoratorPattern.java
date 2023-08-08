package com.example.designpattern.patterns.structural;

/**
 * 목적: 객체에 새로운 기능을 동적으로 추가합니다.
 *
 * Decorator 패턴은 객체에 동적으로 새로운 책임을 추가하는 구조적 패턴입니다.
 * 이 패턴은 기존 코드를 변경하지 않고 기능을 확장하거나 변경하고 싶을 때 유용합니다.
 *
 * Decorator 패턴의 구성 요소는 Component, ConcreteComponent, Decorator, 그리고 ConcreteDecorator 클래스입니다.
 *
 * Component: 모든 객체가 구현해야 할 공통 인터페이스입니다.
 * ConcreteComponent: Component 인터페이스를 구현하는 기본 객체입니다.
 * Decorator: Component 인터페이스를 구현하며, 다른 Component 객체를 장식합니다.
 * ConcreteDecorator: Decorator 클래스를 확장하여 특정 기능을 추가하거나 변경합니다.
 *
 * Decorator 패턴은 기능 확장이 필요할 때 상속을 사용하는 것보다 유연한 방법을 제공하며, 코드 재사용과 유지보수를 쉽게 만듭니다.
 */
public class DecoratorPattern {

    // Component
    interface Coffee {
        double getCost();
        String getDescription();
    }

    // ConcreteComponent
    static class SimpleCoffee implements Coffee {
        @Override
        public double getCost() {
            return 5.0;
        }

        @Override
        public String getDescription() {
            return "Simple Coffee";
        }
    }

    // Decorator
    abstract static class CoffeeDecorator implements Coffee {
        protected Coffee decoratedCoffee;

        public CoffeeDecorator(Coffee decoratedCoffee) {
            this.decoratedCoffee = decoratedCoffee;
        }
    }

    // ConcreteDecorator
    static class MilkDecorator extends CoffeeDecorator {
        public MilkDecorator(Coffee decoratedCoffee) {
            super(decoratedCoffee);
        }

        @Override
        public double getCost() {
            return decoratedCoffee.getCost() + 1.0;
        }

        @Override
        public String getDescription() {
            return decoratedCoffee.getDescription() + ", Milk";
        }
    }
}
