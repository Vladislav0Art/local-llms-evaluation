package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;

public class GeneratedTestText {

    @Test
    public void testText() {
        String text = "Hello World";
        TextNode node = new Document().text(text);
        assertEquals(text, node.text());
    }

}