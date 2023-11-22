package org.example;

import org.example.abstractFactory.factory.Factory;
import org.example.abstractFactory.factory.Link;
import org.example.abstractFactory.factory.Page;
import org.example.abstractFactory.factory.Tray;

public class Main {
    public static void main(String[] args) {
        if(args.length != 2) {
            System.out.println("Usage : java Main filename.html class.name.of.Concrete Factory");
            System.out.println("Example 1 : java Main list.html listFactory.ListFactory");
            System.out.println("Example 2 : java Main div.html divFactory.DivFactory");
            System.exit(0);
        }

        String filename = args[0];
        String classname = args[1];

        Factory factory = Factory.getFactory(classname);

        //Blog
        Link blog1 = factory.createLink("Blog 1", "https://example.com/blog1");
        Link blog2 = factory.createLink("Blog 2", "https://example.com/blog2");
        Link blog3 = factory.createLink("Blog 3", "https://example.com/blog3");

        Tray blogTray = factory.createTray("Blog site");
        blogTray.add(blog1);
        blogTray.add(blog2);
        blogTray.add(blog3);

        //News
        Link news1 = factory.createLink("News 1", "https://example.com/news1");
        Link news2 = factory.createLink("News 2", "https://example.com/news2");
        Tray news3 = factory.createTray("News 3");
        news3.add(factory.createLink("News 3(US)", "https://example.com/news3us"));
        news3.add(factory.createLink("News 3(Korea)", "https://example.com/news3kr"));

        Tray newsTray = factory.createTray("News Site");
        newsTray.add(news1);
        newsTray.add(news2);
        newsTray.add(news3);

        //Page
        Page page  = factory.createPage("Blog and News", "yoons.com");
        page.add(blogTray);
        page.add(newsTray);

        page.output(filename);

    }
}