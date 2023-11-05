package org.example.prototype;

import org.example.prototype.framework.Product;

public class UnderlinePen implements Product {
    private char ulchar;

    public UnderlinePen(char ulchar) {
        this.ulchar = ulchar;
    }


    @Override
    public void use(String s) {
        int ullen = s.length();

        System.out.println(s);
        for (int i = 0; i< ullen; i++) {
            System.out.print(ulchar);
        }
        System.out.println();
    }

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
