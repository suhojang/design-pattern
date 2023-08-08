package com.example.designpattern.patterns.creational;

/**
 * 생성 패턴의 싱글톤 패턴
 * 싱글턴 패턴(Singleton Pattern)은 클래스의 인스턴스가 하나만 생성되도록 보장하며,
 * 그 인스턴스에 쉽게 접근할 수 있는 글로벌 포인트를 제공합니다.
 *
 * 목적: 클래스에 하나의 인스턴스만 생성하고 그 인스턴스에 대한 전역 접근 지점을 제공합니다.
 */
public class SingletonPattern {
    private SingletonPattern() {
    }

    private static class Holder {
        private static final SingletonPattern INSTANCE = new SingletonPattern();
    }

    public static SingletonPattern getInstance() {
        return Holder.INSTANCE;
    }
}

