package com.example.designpattern.patterns.structural;

/**
 * Adapter 패턴은 서로 호환되지 않는 인터페이스를 가진 클래스들을 함께 작동시킬 수 있게 해주는 구조적 패턴입니다.
 * 이 패턴을 사용하면 기존 클래스를 변경하지 않고 새로운 인터페이스로 감싸는 방식으로 작동합니다.
 *
 * Adapter 패턴의 핵심 구성 요소는 Target, Adaptee, 그리고 Adapter 클래스입니다.
 *
 * Target: 클라이언트가 사용하려는 인터페이스입니다.
 * Adaptee: 호환되지 않는 인터페이스를 가진 클래스로, Adapter를 통해 Target 인터페이스로 변환됩니다.
 * Adapter: Target 인터페이스를 구현하며, Adaptee의 메서드를 Target 인터페이스에 맞게 래핑합니다.
 *
 * Adapter 패턴은 기존 코드를 재사용하면서 새로운 인터페이스 요구 사항을 충족시키기 위해 유용하게 사용됩니다.
 */
public class AdapterPattern {

    interface Target {
        void request();
    }

    // Adaptee class
    static class Adaptee {
        void specificRequest() {
            System.out.println("Specific request from Adaptee");
        }
    }

    // Adapter class
    static class Adapter implements Target {
        private final Adaptee adaptee;

        public Adapter(Adaptee adaptee) {
            this.adaptee = adaptee;
        }

        @Override
        public void request() {
            adaptee.specificRequest();
        }
    }
}
