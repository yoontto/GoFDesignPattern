package org.example;

import org.example.Adapter.Print;
import org.example.Adapter.PrintBanner;

public class Main {
    public static void main(String[] args) {
        Print p = new PrintBanner("어댑터 패턴 신박하네");
        p.printWeak();
        p.printStrong();
    }
}