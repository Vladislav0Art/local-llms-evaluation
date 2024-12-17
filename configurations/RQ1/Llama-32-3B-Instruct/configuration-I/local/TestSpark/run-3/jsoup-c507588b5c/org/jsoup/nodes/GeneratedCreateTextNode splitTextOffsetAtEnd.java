package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedCreateTextNode splitTextOffsetAtEnd {

    @Test
    public void createTextNode

    splitTextOffsetAtEnd() {
        String text = "Hello World";
        TextNode node = new TextNode(text);
        TextNode head = node.splitText(text.length());
        assertEquals("", head.text());
        assertEquals("World ", node.text());
    }

}