package com.example.designpattern.patterns.structural;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * 테스트 코드에서는 CompositePattern.CompositeGraphic이 여러 CompositePattern.Graphic 객체를 포함하고 있으며,
 * draw() 메서드가 호출될 때 각 객체의 draw() 메서드가 호출되는지 검증합니다.
 */
class CompositePatternTest {

    @Test
    void testCompositePattern() {
        // Arrange
        CompositePattern.Graphic circle1 = mock(CompositePattern.Circle.class);
        CompositePattern.Graphic circle2 = mock(CompositePattern.Circle.class);
        CompositePattern.CompositeGraphic composite = new CompositePattern.CompositeGraphic();

        composite.add(circle1);
        composite.add(circle2);

        // Act
        composite.draw();

        // Assert
        verify(circle1).draw();
        verify(circle2).draw();
    }
}