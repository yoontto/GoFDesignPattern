package org.example.abstractFactory.factory;

import java.lang.reflect.InvocationTargetException;

public abstract class Factory {
    public static Factory getFactory(String classname) {
        Factory factory = null;

        try {
            factory = (Factory) Class.forName(classname).getDeclaredConstructor().newInstance();

        } catch (ClassNotFoundException e) {
            System.out.println("클래스가 발견되지 않았습니다.");
            throw new RuntimeException(e);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return factory;
    }

    public abstract Link createLink(String caption, String url);
    public abstract Tray createTray(String caption);
    public abstract Page createPage(String title, String author);
}
