package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestGetWholeText {

    @Test
    public void testGetWholeText() {
        TextNode node = new TextNode("test");
        assertEquals("test", node.getWholeText());
    }

}