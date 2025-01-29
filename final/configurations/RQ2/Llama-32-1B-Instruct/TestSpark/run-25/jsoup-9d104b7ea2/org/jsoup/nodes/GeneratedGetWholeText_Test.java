package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedGetWholeText_Test {

    @Test
    public void getWholeText_Test() {
        Document document = new Document();
        Element element = document.createElement("body");
        element.appendChild(document.createElement("h1"));
        element.appendChild(element);
        assertEquals("Hello, World! Hello, World!", document.body.text());
    }

}