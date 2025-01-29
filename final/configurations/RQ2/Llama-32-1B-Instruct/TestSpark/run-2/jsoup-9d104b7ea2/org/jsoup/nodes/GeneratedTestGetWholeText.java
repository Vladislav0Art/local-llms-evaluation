package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;

public class GeneratedTestGetWholeText {

    @Test
    public void testGetWholeText() {
        Node node = new Document().text("Hello World");
        String text = "Hello World";
        TextNode node2 = new Document().text(text);
        assertEquals(text, node.getWholeText());
    }

}