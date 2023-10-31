package org.example;

import org.example.TemplateMethod.AbstractDisplay;
import org.example.TemplateMethod.CharDisplay;
import org.example.TemplateMethod.StringDisplay;

public class Main {
    public static void main(String[] args) {
        AbstractDisplay ad = new CharDisplay('ㅎ');
        AbstractDisplay as = new StringDisplay("abc");

        ad.display();
        as.display();

    }
}