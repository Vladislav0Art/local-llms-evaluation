package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestTextNodeIsNotBlank {

    @Test
    public void testTextNodeIsNotBlank() {
        TextNode textNode = new TextNode("This is a test");
        assertFalse(textNode.isBlank());
    }

}