package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTextNodeIsBlankTest {

    @Test
    public void textNodeIsBlankTest() {
        TextNode textNode = new TextNode("test");
        assertFalse(textNode.isBlank());
        textNode.text(" ");
        assertTrue(textNode.isBlank());
    }

}