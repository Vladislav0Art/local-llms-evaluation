package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;

import static org.junit.Assert.*;

public class GeneratedIsBlankNonBlankTest {

    @Test
    public void isBlankNonBlankTest() {
        TextNode textNode = new TextNode("test");
        assertFalse(textNode.isBlank());
    }

}