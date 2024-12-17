package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedCreateTextNode splitTextOffsetInMiddle {

    @Test
    public void createTextNode

    splitTextOffsetInMiddle() {
        String text = "Hello World";
        TextNode node = new TextNode(text);
        TextNode tail = node.splitText(6);
        assertEquals("World", tail.text());
        assertEquals("Hello ", node.text());
    }

}