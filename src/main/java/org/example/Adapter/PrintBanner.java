package org.example.Adapter;

/**
 * 어댑터 역할
 * : 준비된 Banner를 확장(extend)하고, Print 인터페이스 구현(implement)
 */
public class PrintBanner extends Banner implements Print {

    public PrintBanner(String string) {
        super(string);
    }

    @Override
    public void printWeak() {
        showWithParen();
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
}
