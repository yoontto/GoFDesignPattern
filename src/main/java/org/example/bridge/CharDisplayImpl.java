package org.example.bridge;

import org.example.TemplateMethod.CharDisplay;

public class CharDisplayImpl extends DisplayImpl {
    private char c1;
    private char c2;
    private char c3;

    public CharDisplayImpl (char c1, char c2,char c3){
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
    }

    @Override
    public void rawOpen() {
        System.out.print(c1);
    }

    @Override
    public void rawPrint() {
        System.out.print(c2);
    }

    @Override
    public void rawClose() {
        System.out.println(c3);
    }
}
