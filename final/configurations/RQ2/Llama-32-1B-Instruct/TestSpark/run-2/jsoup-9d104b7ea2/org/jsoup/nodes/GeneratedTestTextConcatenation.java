package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;

public class GeneratedTestTextConcatenation {

    @Test
    public void testTextConcatenation() {
        Node node1 = new Document().text("Hello");
        Node node2 = new Document().text("World");
        String text = "Hello World";
        TextNode node3 = new Document().text(text);
        assertEquals(node1.text(), node3);
        assertEquals("Hello", node1.text());
    }

}