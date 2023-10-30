package org.example;

import org.example.Adapter.FileIO;
import org.example.Adapter.FileProperties;
import org.example.Adapter.Print;
import org.example.Adapter.PrintBanner;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        FileIO f = new FileProperties();

        try {
            f.readFromFile("file.txt");
            f.setValue("a", "에이");
            f.setValue("b", "비");
            f.setValue("c", "씨");
            f.writeToFile("newfile.txt");
            System.out.println("newfile이 생성되었습니다.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}