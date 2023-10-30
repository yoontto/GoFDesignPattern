package org.example.Adapter;

/**
 * 어댑터 역할 2
 * : Banner를 필드로 가지고 생성자를 호출할 떄, 인스턴스를 만든다.
 * 만든 인스턴스를 이용해 PrintBanner의 메소드가 처리해야 할 일을
 * Banner의 메소드에게 위임한다.
 */
public class PrintBanner extends Print {
    private Banner banner;


    public PrintBanner(String string) {
        this.banner = new Banner(string);
    }

    @Override
    public void printWeak() {
        banner.showWithParen();
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }
}
