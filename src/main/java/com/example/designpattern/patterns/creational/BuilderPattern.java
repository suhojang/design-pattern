package com.example.designpattern.patterns.creational;

/**
 * 목적: 복잡한 객체의 생성을 단계별로 분리합니다.
 *
 *  Builder 패턴은 복잡한 객체를 생성하는 프로세스를 분리하여 코드의 유연성과 가독성을 향상시킵니다.
 *  특히, 많은 매개변수를 가진 객체를 생성할 때 유용하며, 객체 생성을 단계별로 구성할 수 있습니다.
 *
 *  Builder 패턴의 핵심은 Builder 내부 클래스입니다.
 *  이 클래스를 사용하여 객체를 단계별로 구성하고, 마지막에 build() 메서드를 호출하여 객체를 생성할 수 있습니다.
 *
 *  이 패턴을 사용하면 클라이언트 코드가 더 간결해지고 가독성이 향상됩니다.
 *  또한, 불변성을 쉽게 유지할 수 있으며, 필수 및 선택 매개변수의 조합에 대한 유연성을 제공합니다.
 */
public class BuilderPattern {

    private String partA;
    private String partB;
    private String partC;

    // Private constructor
    private BuilderPattern(BuilderPattern.Builder builder) {
        this.partA = builder.partA;
        this.partB = builder.partB;
        this.partC = builder.partC;
    }

    public String getPartA() {
        return partA;
    }

    public String getPartB() {
        return partB;
    }

    public String getPartC() {
        return partC;
    }

    public static class Builder {
        private String partA;
        private String partB;
        private String partC;

        public Builder setPartA(String partA) {
            this.partA = partA;
            return this;
        }

        public Builder setPartB(String partB) {
            this.partB = partB;
            return this;
        }

        public Builder setPartC(String partC) {
            this.partC = partC;
            return this;
        }

        public BuilderPattern build() {
            return new BuilderPattern(this);
        }
    }
}
