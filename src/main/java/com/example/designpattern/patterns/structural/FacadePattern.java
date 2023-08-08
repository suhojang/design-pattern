package com.example.designpattern.patterns.structural;

/**
 * 목적: 복잡한 시스템에 대한 간편한 인터페이스를 제공합니다.
 *
 * Facade 패턴은 복잡한 시스템의 인터페이스를 단순화하는 구조적 디자인 패턴입니다.
 * Facade는 복잡한 서브시스템의 일련의 인터페이스를 간소화하며, 클라이언트와 서브시스템 간의 상호작용을 줄입니다.
 *
 * Facade 패턴에서 ComputerFacade 클래스는 복잡한 서브시스템인 CPU, Memory, HardDrive 등을 감싸고 단순한 인터페이스를 제공합니다.
 * 클라이언트는 startComputer 메서드만 호출하면 되므로, 서브시스템의 복잡성을 숨길 수 있습니다.
 *
 * Facade 패턴은 서브시스템의 복잡성을 줄이고, 클라이언트 코드와 서브시스템 간의 의존성을 낮추어 유지보수와 확장성을 증가시킵니다.
 */
public class FacadePattern {

    // Complex subsystem classes
    static class CPU {
        void start() {
            System.out.println("CPU Started");
        }
    }

    static class Memory {
        void load() {
            System.out.println("Memory Loaded");
        }
    }

    static class HardDrive {
        void read() {
            System.out.println("Hard Drive Reading");
        }
    }

    // Facade
    static class ComputerFacade {
        private final CPU cpu;
        private final Memory memory;
        private final HardDrive hardDrive;

        public ComputerFacade() {
            this(new CPU(), new Memory(), new HardDrive());
        }

        public ComputerFacade(CPU cpu, Memory memory, HardDrive hardDrive) {
            this.cpu = cpu;
            this.memory = memory;
            this.hardDrive = hardDrive;
        }

        public void startComputer() {
            cpu.start();
            memory.load();
            hardDrive.read();
        }
    }
}
