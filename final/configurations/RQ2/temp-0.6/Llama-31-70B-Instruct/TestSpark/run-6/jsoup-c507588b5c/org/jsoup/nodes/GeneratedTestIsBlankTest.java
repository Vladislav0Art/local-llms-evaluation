package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;
import org.junit.Test;

public class GeneratedTestIsBlankTest {

    @Test
    public void testIsBlankTest() {
        String text = "This is a test";
        TextNode textNode = new TextNode(text);
        assertFalse(textNode.isBlank());
    }

}