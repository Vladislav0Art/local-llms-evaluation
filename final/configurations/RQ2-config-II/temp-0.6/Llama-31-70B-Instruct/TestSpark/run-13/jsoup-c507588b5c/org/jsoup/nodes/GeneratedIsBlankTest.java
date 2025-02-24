package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

public class GeneratedIsBlankTest {

    @Test
    public void isBlankTest() {
        TextNode textNode = new TextNode(" ");
        assertTrue(textNode.isBlank());
        textNode.text("Hello world!");
        assertFalse(textNode.isBlank());
    }

}