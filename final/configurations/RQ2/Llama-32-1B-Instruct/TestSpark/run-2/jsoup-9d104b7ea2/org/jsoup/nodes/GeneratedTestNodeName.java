package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;

public class GeneratedTestNodeName {

    @Test
    public void testNodeName() {
        Node node = new Document().text("Hello World");
        assertEquals("Text", node.nodeName());
    }

}