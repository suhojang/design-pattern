package com.example.designpattern.patterns.structural;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * 테스트 코드에서는 ProxyImage가 display 메서드를 호출할 때 RealImage의 display 메서드가 호출되는지 확인합니다.
 */
class ProxyPatternTest {

    @Test
    void testProxyPattern() {
        String filename = "image.jpg";
        ProxyPattern.RealImage realImage = mock(ProxyPattern.RealImage.class);
        ProxyPattern.ProxyImage proxyImage = new ProxyPattern.ProxyImage(filename, realImage);

        // Act
        proxyImage.display();

        // Assert
        verify(realImage).display();
    }

}