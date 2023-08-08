package com.example.designpattern.patterns.structural;

import java.util.ArrayList;
import java.util.List;

/**
 * 목적: 개별 객체와 복합 객체를 동일하게 취급합니다.
 *
 * Composite 패턴은 객체들을 트리 구조로 구성하여 부분-전체 계층을 표현하는 구조적 패턴입니다.
 * 이 패턴을 사용하면 개별 객체와 객체 컨테이너를 동일하게 취급할 수 있습니다.
 *
 * Composite 패턴의 핵심 요소는 Component, Leaf, 그리고 Composite 클래스입니다.
 *
 * Component: 모든 객체가 구현해야 할 공통 인터페이스입니다.
 * Leaf: Component 인터페이스를 구현하는 개별 객체입니다.
 * Composite: Component 인터페이스를 구현하며, 여러 Component 객체를 포함합니다.
 *
 * Composite 패턴은 트리 구조를 만들거나 단일 객체와 복합 객체를 동일한 방식으로 다루어야 할 때 유용하게 사용됩니다.
 *
 */
public class CompositePattern {

    // Component
    interface Graphic {
        void draw();
    }

    // Leaf
    static class Circle implements Graphic {
        @Override
        public void draw() {
            System.out.println("Drawing Circle");
        }
    }

    // Composite
    static class CompositeGraphic implements Graphic {
        private final List<Graphic> graphics = new ArrayList<>();

        public void add(Graphic graphic) {
            graphics.add(graphic);
        }

        @Override
        public void draw() {
            for (Graphic graphic : graphics) {
                graphic.draw();
            }
        }
    }
}
