package org.example.FactoryMethod.idCard;

import org.example.FactoryMethod.framework.Product;

public class IDCard extends Product {
    private String owner;
    private int number;

    IDCard(String owner, int number) {
        System.out.println(owner + "의 카드를 만듭니다.");
        this.owner = owner;
        this.number = number;
    }

    @Override
    public void use() {
        System.out.println(owner + number + "의 카드를 사용합니다.");
    }

    @Override
    public String toString() {
        return "[IDCard : " + owner + number + " ]";
    }

    public String getOwner(){
        return owner;
    }

    public int getNumber(){
        return number;
    }
}
