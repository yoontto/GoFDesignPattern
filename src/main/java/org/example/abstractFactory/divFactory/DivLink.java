package org.example.abstractFactory.divFactory;

import org.example.abstractFactory.factory.Link;

public class DivLink extends Link {

    public DivLink(String caption, String url) {
        super(caption, url);
    }

    @Override
    public String makeHTML() {
        StringBuilder sb = new StringBuilder();
        sb.append("<div class=\"LINK\"><a href=\""+ url +"\">");
        sb.append(caption);
        sb.append("</a></div>");
        return sb.toString();
    }
}
