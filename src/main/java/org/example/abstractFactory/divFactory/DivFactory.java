package org.example.abstractFactory.divFactory;

import org.example.abstractFactory.factory.Factory;
import org.example.abstractFactory.factory.Link;
import org.example.abstractFactory.factory.Page;
import org.example.abstractFactory.factory.Tray;

public class DivFactory extends Factory {
    @Override
    public Link createLink(String caption, String url) {
        return new DivLink(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return new DivTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new DivPage(title, author);
    }
}
