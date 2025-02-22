package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestNodeName {

    @Test
    public void testNodeName() {
        TextNode node = new TextNode("test");
        assertEquals("#text", node.nodeName());
    }

}