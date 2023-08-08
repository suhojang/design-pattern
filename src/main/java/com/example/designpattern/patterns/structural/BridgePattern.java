package com.example.designpattern.patterns.structural;

/**
 * 목적: 구현부에서 추상화부를 분리하여 독립적으로 변화할 수 있게 합니다
 *
 * Bridge 패턴은 구현부에서 추상화를 분리하여 두 부분이 독립적으로 변화할 수 있도록 만드는 구조적 디자인 패턴입니다.
 * 이 패턴은 추상화와 구현 사이의 연결을 유연하게 유지하며, 클라이언트 코드가 구현 세부사항과 분리됩니다.
 *
 * Bridge 패턴에서는 Implementor 인터페이스가 구현을 나타내며, Abstraction 클래스는 추상화를 나타냅니다.
 * 두 부분은 서로 분리되어 있어 추상화와 구현이 독립적으로 확장될 수 있습니다.
 *
 * Bridge 패턴은 두 개 이상의 클래스 계층 사이의 연결을 강화하고,
 * 변경이 필요할 때 둘 중 하나만 변경하면 되도록 합니다.
 * 이로써 더 나은 코드 유지보수와 확장성을 제공합니다.
 */
public class BridgePattern {

    // Implementor
    interface Color {
        String applyColor();
    }

    // ConcreteImplementor
    static class RedColor implements Color {
        @Override
        public String applyColor() {
            return "Red";
        }
    }

    static class BlueColor implements Color {
        @Override
        public String applyColor() {
            return "Blue";
        }
    }

    // Abstraction
    abstract static class Shape {
        protected Color color;

        public Shape(Color color) {
            this.color = color;
        }

        public abstract String draw();
    }

    // RefinedAbstraction
    static class Circle extends Shape {
        public Circle(Color color) {
            super(color);
        }

        @Override
        public String draw() {
            return "Drawing Circle in " + color.applyColor() + " color";
        }
    }
}
