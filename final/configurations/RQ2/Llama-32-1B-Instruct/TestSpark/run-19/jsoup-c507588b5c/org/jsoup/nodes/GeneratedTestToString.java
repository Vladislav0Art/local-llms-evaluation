package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.jupiter.api.Test;

public class GeneratedTestToString {

    @Test
    public void testToString() {
        String text = "Hello, World!";
        Element element = Mockito.mock(Element.class);
        TextNode node = new TextNode(text);
        Mockito.when(element.getOuterHtml()).thenReturn("Hello, World!");
        assertEquals("HEllo, WorlD", node.toString());
    }

}