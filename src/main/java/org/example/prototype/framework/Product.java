package org.example.prototype.framework;

//Prototype 역할
public interface Product extends Cloneable {
    public abstract void use(String s);
    public abstract Product createCopy();
}
