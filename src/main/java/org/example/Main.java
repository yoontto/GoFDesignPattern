package org.example;

import org.example.bridge.*;

public class Main {
    public static void main(String[] args) {
        //연습문제 1 수정
        RandomCountDisplay d1 = new RandomCountDisplay(new StringDisplayImpl("테스트!"));
        //d1.randomDisplay(3);

        //연습문제 2
        Display d2 = new Display(new FileDisplayImpl("file.txt"));
        //d2.display();

        //연습문제 3
        IncreaseDisplay d3 = new IncreaseDisplay(new CharDisplayImpl('#', '-', '^'), 3);
        d3.increaseDisplay(10);
    }
}