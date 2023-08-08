package com.example.designpattern.patterns.structural;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * 목적: 많은 수의 비슷한 객체를 효율적으로 공유하여 사용합니다.
 *
 * Flyweight 패턴은 메모리를 효율적으로 사용하려고 객체를 재사용하는 구조적 패턴입니다.
 * 큰 수의 유사한 객체를 생성해야 할 때, 이 패턴을 사용하면 메모리 사용량을 크게 줄일 수 있습니다.
 *
 * 이 코드 예제에서 Shape 인터페이스는 Flyweight 객체가 가져야 할 메서드를 정의하고, Circle 클래스는 이 인터페이스를 구현합니다.
 * ShapeFactory 클래스는 이미 생성된 Circle 객체를 재사용하기 위한 목적으로 사용됩니다.
 */
public class FlyweightPattern {

    // Flyweight interface
    interface Shape {
        void draw(int x, int y);
    }

    // Concrete Flyweight class
    static class Circle implements Shape {
        private final String color;

        public Circle(String color) {
            this.color = color;
        }

        @Override
        public void draw(int x, int y) {
            System.out.println("Drawing a " + color + " circle at (" + x + ", " + y + ")");
        }
    }

    // Flyweight Factory class
    static class ShapeFactory {
        private static final Map<String, Shape> shapes = new HashMap<>();

        public static Shape getCircle(String color) {
            Shape shape = shapes.get(color);

            if (shape == null) {
                shape = new Circle(color);
                shapes.put(color, shape);
            }

            return shape;
        }
    }
}
