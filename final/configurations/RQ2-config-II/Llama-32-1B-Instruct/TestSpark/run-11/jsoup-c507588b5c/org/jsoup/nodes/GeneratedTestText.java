package org.jsoup.nodes;

import org.jsoup.nodes.Appendable;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTestText {

    @Test
    public void testText() {
        TextNode node = new TextNode("Hello, World!");
        String text = node.text();
        assertEquals("Hello, World!", text);
    }

}