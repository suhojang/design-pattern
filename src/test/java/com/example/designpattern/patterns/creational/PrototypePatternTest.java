package com.example.designpattern.patterns.creational;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;

/**
 * 테스트 코드에서는 원본 객체와 복제된 객체가 동일하지 않지만, 동일한 속성 값을 가지고 있는지 확인합니다.
 */
class PrototypePatternTest {

    @DisplayName("Prototype 패턴 테스트")
    @Test
    void testClone() {
        // Arrange
        PrototypePattern original = new PrototypePattern("Property A", "Property B");

        // Act
        PrototypePattern cloned = original.clone();

        // Assert
        assertNotSame(original, cloned);
        assertEquals(original.getPropertyA(), cloned.getPropertyA());
        assertEquals(original.getPropertyB(), cloned.getPropertyB());
    }
}