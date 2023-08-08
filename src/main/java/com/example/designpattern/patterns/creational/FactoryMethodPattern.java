package com.example.designpattern.patterns.creational;

/**
 * Factory Method 패턴은 객체를 생성하는 인터페이스를 정의하며
 * 어떤 클래스의 인스턴스를 만들지는 서브클래스에서 결정하도록 합니다.
 * 이 패턴은 객체 생성 로직과 클라이언트 코드를 분리해 주어, 유연성과 확장성을 향상시킵니다.
 *
 * 목적: 객체 생성을 하위 클래스에게 위임합니다.
 */

public class FactoryMethodPattern {

    interface Product {
        void create();
    }

    static class ConcreteProductA implements Product {

        @Override
        public void create() {
            System.out.println("Creating Product A");
        }
    }

    static class ConcreteProductB implements Product {

        @Override
        public void create() {
            System.out.println("Creating Product B");
        }
    }

    // Creator interface
    abstract static class Creator {
        public abstract Product factoryMethod();
    }

    // Concrete Creators
    static class ConcreteCreatorA extends Creator {
        @Override
        public Product factoryMethod() {
            return new ConcreteProductA();
        }
    }

    static class ConcreteCreatorB extends Creator {
        @Override
        public Product factoryMethod() {
            return new ConcreteProductB();
        }
    }
}
