package org.example.Adapter;

import java.io.IOException;

/**
 * Target 대상 역할
 *  : 현재 필요한 메소드를 정의해줌
 */
public interface FileIO {
    public void readFromFile(String Filename) throws IOException;
    public void writeToFile(String Filename) throws IOException;
    public void setValue(String key, String value);
    public String getValue(String key);

}
