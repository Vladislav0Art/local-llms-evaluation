package org.jsoup.nodes;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

public class GeneratedIsBlankTest {

    @Test
    public void isBlankTest() {
        String text = "       ";
        TextNode textNode = new TextNode(text);
        assertTrue(textNode.isBlank());

        text = "Sample text";
        textNode = new TextNode(text);
        assertFalse(textNode.isBlank());
    }

}