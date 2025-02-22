package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestTextNodeCreation {

    @Test
    public void testTextNodeCreation() {
        String text = "This is a test";
        TextNode textNode = new TextNode(text);
        assertEquals(text, textNode.text());
    }

}