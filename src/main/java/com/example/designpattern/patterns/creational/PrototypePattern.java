package com.example.designpattern.patterns.creational;

/**
 * 목적: 기존 객체의 복사본을 생성합니다.
 *
 * Prototype 패턴은 기존 객체의 복제를 통해 새로운 객체를 생성하는 디자인 패턴입니다.
 * 객체 생성 비용이 높은 경우나 상태를 공유하려는 경우에 유용합니다.
 *
 * 여기서 Prototype 클래스는 Cloneable 인터페이스를 구현하며,
 * clone() 메서드를 통해 객체를 복제합니다.
 * clone() 메서드 내에서는 super.clone()을 호출하여 얕은 복사를 수행합니다.
 *
 * Prototype 패턴은 객체 생성 비용이 높은 상황에서 효율적이며,
 * 각각의 객체가 상태를 공유할 필요가 없을 때 사용됩니다.
 */
public class PrototypePattern implements Cloneable {

    private final String propertyA;
    private final String propertyB;

    public PrototypePattern(String propertyA, String propertyB) {
        this.propertyA = propertyA;
        this.propertyB = propertyB;
    }

    public String getPropertyA() {
        return propertyA;
    }

    public String getPropertyB() {
        return propertyB;
    }

    @Override
    public PrototypePattern clone() {
        try {
            return (PrototypePattern) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Failed to clone object", e);
        }
    }
}
