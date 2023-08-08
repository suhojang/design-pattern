package com.example.designpattern.patterns.structural;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * 테스트 코드에서는 Adapter 객체를 생성하고, request 메서드를 호출하여 예외가 발생하지 않음을 확인합니다.
 * 이로써 Adaptee의 기능이 Target 인터페이스를 통해 접근 가능함을 검증합니다.
 */
class AdapterPatternTest {

    @Test
    void testAdapterPattern() {
        // Arrange
        AdapterPattern.Adaptee adaptee = new AdapterPattern.Adaptee();
        AdapterPattern.Target target = new AdapterPattern.Adapter(adaptee);

        // Act & Assert
        assertDoesNotThrow(target::request);
    }
}