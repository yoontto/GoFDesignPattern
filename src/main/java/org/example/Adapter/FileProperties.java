package org.example.Adapter;

import java.io.*;
import java.util.Properties;


/**
 * 어댑터 역할
 *  : 기존의 FileIO 클래스의 메소드를 상속받아 변경해서 사용하는 역할
 *    Properties 는 Adaptee 역할
 */
public class FileProperties implements FileIO {
    //Properties 는 Adaptee 역할
    Properties p = new Properties();

    @Override
    public void readFromFile(String filename) throws IOException {
        p.load(new FileReader(filename));
    }

    @Override
    public void writeToFile(String filename) throws IOException {
        p.store(new FileWriter(filename), "written by FileProperties");
    }

    @Override
    public void setValue(String key, String value) {
        p.setProperty(key, value);
    }

    @Override
    public String getValue(String key) {
        return p.getProperty(key);
    }
}
