package org.example.prototype.framework;

import java.util.HashMap;
import java.util.Map;
//Client(이용자) 역할
public class Manager {
    private Map<String, Product> showcase = new HashMap<>();

    public void register(String name, Product prototype){
        showcase.put(name, prototype);
    }

    public Product create(String prototypeName) {
        Product p = showcase.get(prototypeName);
        return p.createCopy();
    }
}
