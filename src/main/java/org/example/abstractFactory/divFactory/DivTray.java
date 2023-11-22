package org.example.abstractFactory.divFactory;

import org.example.abstractFactory.factory.Item;
import org.example.abstractFactory.factory.Tray;

public class DivTray extends Tray {

    public DivTray (String caption) {
        super(caption);
    }

    @Override
    public String makeHTML() {
        StringBuilder sb = new StringBuilder();

        sb.append("<p><b>");
        sb.append(caption);
        sb.append("</b></p>\n");

        sb.append("<div class=\"TRAY\">");

        for (Item i : tray) {
            sb.append(i.makeHTML());
        }

        sb.append("</div>\n");

        return sb.toString();
    }
}
