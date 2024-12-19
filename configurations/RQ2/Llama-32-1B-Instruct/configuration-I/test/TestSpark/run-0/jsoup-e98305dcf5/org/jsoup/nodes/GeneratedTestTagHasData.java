package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.jupiter.api.Test;
import org.jsoup.nodes.*;

public class GeneratedTestTagHasData {

    @Test
    public void testTagHasData() {
        Document doc = Jsoup.create("<span>Hello World!</span>");
        assertEquals("", doc.getData());
        doc.appendText("World!");
        assertEquals("Hello World!", doc.getData());
    }

}