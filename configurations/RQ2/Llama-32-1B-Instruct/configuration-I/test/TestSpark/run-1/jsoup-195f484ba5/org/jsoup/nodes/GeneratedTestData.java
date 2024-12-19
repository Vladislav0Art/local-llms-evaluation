package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.junit.jupiter.api.Test;

public class GeneratedTestData {

    @Test
    public void testData() {
        Element element = new Element("<p data-value='test'>This is a paragraph of text.</p>");
        assertEquals("test", element.data());
    }

}