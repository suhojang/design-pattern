package com.example.designpattern.patterns.structural;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * 테스트 코드에서는 각 서브시스템이 올바르게 호출되는지 검증합니다.
 * 실제 코드에서는 리플렉션 또는 비슷한 메커니즘을 사용하여 모의 객체를 주입할 수 있습니다.
 */
class FacadePatternTest {

    @Test
    void testFacadePattern() {
        // Arrange
        FacadePattern.CPU cpu = mock(FacadePattern.CPU.class);
        FacadePattern.Memory memory = mock(FacadePattern.Memory.class);
        FacadePattern.HardDrive hardDrive = mock(FacadePattern.HardDrive.class);

        FacadePattern.ComputerFacade facade = new FacadePattern.ComputerFacade(cpu, memory, hardDrive);

        // Act
        facade.startComputer();

        // Assert
        verify(cpu).start();
        verify(memory).load();
        verify(hardDrive).read();
    }
}