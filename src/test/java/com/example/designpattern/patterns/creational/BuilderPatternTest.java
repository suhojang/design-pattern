package com.example.designpattern.patterns.creational;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * 테스트 코드에서는 Builder를 사용하여 Product 객체를 생성하고, 올바른 속성 값을 가지고 있는지 확인합니다.
 */
class BuilderPatternTest {

    @DisplayName("빌더 패턴 테스트")
    @Test
    void testBuilderPattern() {
        // Arrange
        String partA = "Part A";
        String partB = "Part B";
        String partC = "Part C";

        // Act
        BuilderPattern builderPattern = new BuilderPattern.Builder()
                .setPartA(partA)
                .setPartB(partB)
                .setPartC(partC)
                .build();

        // Assert
        assertEquals(partA, builderPattern.getPartA());
        assertEquals(partB, builderPattern.getPartB());
        assertEquals(partC, builderPattern.getPartC());
    }
}