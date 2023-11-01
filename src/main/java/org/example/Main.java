package org.example;

import org.example.FactoryMethod.framework.Factory;
import org.example.FactoryMethod.framework.Product;
import org.example.FactoryMethod.idCard.IDCardFactory;

public class Main {
    public static void main(String[] args) {
        Factory f = new IDCardFactory();
        Product p1 = f.create("준원");
        Product p2 = f.create("윤서");

        p1.use();
        p2.use();
    }
}