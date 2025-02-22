package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestText {

    @Test
    public void testText() {
        TextNode node = new TextNode("test");
        assertEquals("test", node.text());
    }

}