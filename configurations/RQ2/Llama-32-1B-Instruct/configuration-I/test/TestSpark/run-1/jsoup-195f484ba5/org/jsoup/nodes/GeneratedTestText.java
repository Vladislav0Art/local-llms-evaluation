package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.junit.jupiter.api.Test;

public class GeneratedTestText {

    @Test
    public void testText() {
        Element element = new Element("<p>This is a paragraph of text</p>");
        assertTrue(element.text().length() > 0);
    }

}