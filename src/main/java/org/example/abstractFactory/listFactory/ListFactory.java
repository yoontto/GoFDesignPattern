package org.example.abstractFactory.listFactory;

import org.example.abstractFactory.factory.Factory;
import org.example.abstractFactory.factory.Link;
import org.example.abstractFactory.factory.Page;
import org.example.abstractFactory.factory.Tray;

public class ListFactory extends Factory {
    @Override
    public Link createLink(String caption, String url) {
        return new ListLink(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return new ListTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new ListPage(title, author);
    }
}
