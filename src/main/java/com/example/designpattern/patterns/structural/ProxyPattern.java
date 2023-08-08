package com.example.designpattern.patterns.structural;

/**
 * 목적: 실제 객체를 대신해 다른 객체에 대한 접근을 제어합니다.
 *
 * Proxy 패턴은 객체의 대리자 또는 대체자를 제공하여 접근을 제어하는 구조적 디자인 패턴입니다.
 * Proxy 패턴은 원격 프록시, 가상 프록시, 보호 프록시 등 다양한 방식으로 사용될 수 있으며, 대상 객체에 대한 접근을 제어하거나 추가 작업을 수행하는 데 유용합니다.
 *
 * 이 코드 예제에서 Image 인터페이스는 Real Subject와 Proxy가 구현해야 할 메서드를 정의하고,
 * RealImage 클래스는 이 인터페이스를 구현합니다.
 * ProxyImage 클래스는 RealImage의 프록시로 사용되며, 필요한 경우에만 실제 이미지를 로드합니다.
 *
 * Proxy 패턴을 사용하면 객체의 생성과 접근을 제어하거나 추가적인 작업을 수행할 수 있으며,
 * 성능 최적화, 권한 제어 등 다양한 시나리오에서 활용될 수 있습니다.
 */
public class ProxyPattern {

    // Subject interface
    interface Image {
        void display();
    }

    // Real Subject
    static class RealImage implements Image {
        private final String filename;

        public RealImage(String filename) {
            this.filename = filename;
            loadFromDisk();
        }

        private void loadFromDisk() {
            System.out.println("Loading " + filename);
        }

        @Override
        public void display() {
            System.out.println("Displaying " + filename);
        }
    }

    // Proxy
    static class ProxyImage implements Image {
        private RealImage realImage;
        private final String filename;

        public ProxyImage(String filename) {
            this.filename = filename;
        }

        public ProxyImage(String filename, RealImage realImage) {
            this.filename = filename;
            this.realImage = realImage;
        }

        @Override
        public void display() {
            if (realImage == null) {
                realImage = new RealImage(filename);
            }
            realImage.display();
        }
    }
}
