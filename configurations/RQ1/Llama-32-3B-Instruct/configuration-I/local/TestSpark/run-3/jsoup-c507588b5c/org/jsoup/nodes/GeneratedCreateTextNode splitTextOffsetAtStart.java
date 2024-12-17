package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedCreateTextNode splitTextOffsetAtStart {

    @Test
    public void createTextNode

    splitTextOffsetAtStart() {
        String text = "Hello World";
        TextNode node = new TextNode(text);
        TextNode tail = node.splitText(0);
        assertEquals("", tail.text());
        assertEquals("Hello", node.text());
    }

}