package com.example.designpattern.patterns.structural;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertSame;

/**
 * 테스트 코드에서는 두 개의 동일한 색상의 원을 요청하고 동일한 인스턴스가 반환되는지 확인합니다.
 * Flyweight 패턴을 사용함으로써 동일한 객체가 여러 번 생성되지 않으므로 메모리 사용을 최적화할 수 있습니다.
 */
class FlyweightPatternTest {

    @Test
    void testFlyweightPattern() {
        // Arrange
        String color = "red";
        FlyweightPattern.Circle circle1 = (FlyweightPattern.Circle) FlyweightPattern.ShapeFactory.getCircle(color);
        FlyweightPattern.Circle circle2 = (FlyweightPattern.Circle) FlyweightPattern.ShapeFactory.getCircle(color);

        // Act & Assert
        assertSame(circle1, circle2);
    }
}