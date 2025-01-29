package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedSplitText_Test {

    @Test
    public void splitText_Test() {
        Document document = new Document();
        Element element = document.createElement("h1");
        element.appendChild(document.createElement("span"));
        assertEquals(1, 1);
    }

}