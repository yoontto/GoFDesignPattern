package org.example.bridge;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FileDisplayImpl extends DisplayImpl {
    private String filename;

    public FileDisplayImpl(String filename) {
        this.filename = filename;
    }

    @Override
    public void rawOpen() {
        System.out.println("---------------"+filename+"---------------");
    }

    @Override
    public void rawPrint() {
        try {
            List<String> contents = Files.readAllLines(Path.of(filename));

            for(String line : contents) {
                System.out.print("> ");
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void rawClose() {
        System.out.println("------------------------------");
    }
}
