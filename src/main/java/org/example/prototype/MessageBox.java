package org.example.prototype;

import org.example.prototype.framework.Product;

public class MessageBox implements Product {
    private char decochar;

    public MessageBox(char decochar) {
        this.decochar = decochar;
    }

    @Override
    public void use(String s) {
        int decolen = 1 + s.length() + 1;
        for(int i = 0; i < decolen; i++) {
            System.out.print(decochar);
        }
        System.out.println();
        System.out.println(decochar + s + decochar);
        for(int i = 0; i < decolen; i++) {
            System.out.print(decochar);
        }
        System.out.println();
    }


    /*
        [clone 메소드]
        자기 자신의 복제를 생성하는 메소드
        인스턴스가 가지고 있는 필드 값도 그대로 복제됨
        자신의 클래스 및 하위에서만 호출할 수 있음
        다른 클래스에서 호출할 때는 createCopy 처럼 별도의 메소드로 감싸주기
    */
    @Override
    public Product createCopy() {
        Product p = null;
        try {
            p = (Product) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }
}
