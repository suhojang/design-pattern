package com.example.designpattern.patterns.creational;

/**
 * Abstract Factory 패턴은 관련성이 있거나 의존적인 객체의 집합을 생성하기 위한 인터페이스를 제공하며,
 * 구체 클래스는 서브 클래스에서 결정합니다.
 * 이 패턴은 Factory Method 패턴을 확장한 형태로 볼 수 있으며,
 * 제품군을 생성하기 위해 사용됩니다.
 *
 * 목적: 관련된 객체의 집합을 생성하기 위한 인터페이스를 제공합니다.
 *
 * Abstract Factory 패턴에서는 제품군을 나타내는 여러 개의 제품 인터페이스가 있으며,
 * 각 인터페이스에 대한 구체적인 구현이 제공됩니다.
 * Abstract Factory는 이러한 제품군을 생성하는 메서드의 집합을 정의하고,
 * Concrete Factory는 해당 메서드를 구현합니다.
 */
public class AbstractFactoryPattern {

    interface ProductA {
        void createA();
    }

    interface ProductB {
        void createB();
    }

    // Concrete Products
    static class ConcreteProductA1 implements ProductA {
        @Override
        public void createA() {
            System.out.println("Creating Product A1");
        }
    }

    static class ConcreteProductB1 implements ProductB {
        @Override
        public void createB() { System.out.println("Creating Product B1"); }
    }

    static class ConcreteProductA2 implements ProductA {
        @Override
        public void createA() { System.out.println("Creating Product A2"); }
    }

    static class ConcreteProductB2 implements ProductB {
        @Override
        public void createB() { System.out.println("Creating Product B2"); }
    }

    // Abstract Factory
    abstract static class AbstractFactory {
        abstract ProductA createProductA();
        abstract ProductB createProductB();
    }

    // Concrete Factories
    static class ConcreteFactory1 extends AbstractFactory {
        @Override
        public ProductA createProductA() { return new ConcreteProductA1(); }

        @Override
        public ProductB createProductB() { return new ConcreteProductB1(); }
    }

    static class ConcreteFactory2 extends AbstractFactory {
        @Override
        public ProductA createProductA() { return new ConcreteProductA2(); }

        @Override
        public ProductB createProductB() { return new ConcreteProductB2(); }
    }
}
