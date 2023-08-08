package com.example.designpattern.patterns.creational;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingletonPatternTest {

    @DisplayName("싱글톤 패턴 테스트")
    @Test
    void testSingleton() {
        // Act
        SingletonPattern instance1 = SingletonPattern.getInstance();
        SingletonPattern instance2 = SingletonPattern.getInstance();

        // Assert
        assertSame(instance1, instance2); // 두 인스턴스가 동일한 참조를 가리키는지 확인
    }
}