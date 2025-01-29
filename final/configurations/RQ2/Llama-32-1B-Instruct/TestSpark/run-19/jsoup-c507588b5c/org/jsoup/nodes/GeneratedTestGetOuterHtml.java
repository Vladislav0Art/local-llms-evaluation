package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.jupiter.api.Test;

public class GeneratedTestGetOuterHtml {

    @Test
    public void testGetOuterHtml() {
        String text = "Hello, World!";
        Element element = Mockito.mock(Element.class);
        TextNode node = new TextNode(text);
        Mockito.when(element.getOuterHtml()).thenReturn("Hello, World!");
        assertEquals("Hello, World!", node.outerHtml());
    }

}