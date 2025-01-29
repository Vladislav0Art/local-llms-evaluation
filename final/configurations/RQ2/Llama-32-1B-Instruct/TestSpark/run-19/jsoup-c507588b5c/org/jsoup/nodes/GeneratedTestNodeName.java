package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.jupiter.api.Test;

public class GeneratedTestNodeName {

    @Test
    public void testNodeName() {
        String text = "Hello, World!";
        TextNode node = new TextNode(text);
        assertEquals("HEllo, WorlD", node.nodeName());
    }

}