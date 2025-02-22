package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestTextSetter {

    @Test
    public void testTextSetter() {
        TextNode node = new TextNode("test");
        node.text("newText");
        assertEquals("newText", node.text());
    }

}