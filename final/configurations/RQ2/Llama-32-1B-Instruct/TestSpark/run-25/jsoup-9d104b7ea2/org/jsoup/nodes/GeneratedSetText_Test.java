package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedSetText_Test {

    @Test
    public void setText_Test() {
        Document document = new Document();
        Element element = document.createElement("p");
        element.setText("Hello, World!");
        assertEquals("Hello, World!", element.text());
    }

}