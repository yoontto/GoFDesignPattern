package org.example.FactoryMethod.idCard;

import org.example.FactoryMethod.framework.Factory;
import org.example.FactoryMethod.framework.Product;

public class IDCardFactory extends Factory {
    @Override
    public Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    public void registerProduct(Product product) {
        System.out.println(product + "를 등록했습니다.");
    }
}
