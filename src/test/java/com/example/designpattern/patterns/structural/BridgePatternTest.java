package com.example.designpattern.patterns.structural;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * 테스트 코드에서는 빨간색과 파란색으로 색칠된 원을 그리고, 각각의 출력을 검증합니다.
 */
class BridgePatternTest {
    @Test
    void testBridgePattern() {
        // Arrange
        BridgePattern.Color red = new BridgePattern.RedColor();
        BridgePattern.Shape redCircle = new BridgePattern.Circle(red);

        BridgePattern.Color blue = new BridgePattern.BlueColor();
        BridgePattern.Shape blueCircle = new BridgePattern.Circle(blue);

        // Act & Assert
        assertEquals("Drawing Circle in Red color", redCircle.draw());
        assertEquals("Drawing Circle in Blue color", blueCircle.draw());
    }
}