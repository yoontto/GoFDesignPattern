package org.example.TemplateMethod;

public class StringDisplay extends AbstractDisplay {
    private String s;
    private int width;

    public StringDisplay(String s) {
        this.s = s;
        this.width = s.length();
    }

    @Override
    public void open() {
        printLine();
    }

    @Override
    public void print() {
        System.out.println("|" + s + "|");
    }

    @Override
    public void close() {
        printLine();
    }

    private void printLine(){
        System.out.print("+");
        for(int i = 0; i < width; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}
