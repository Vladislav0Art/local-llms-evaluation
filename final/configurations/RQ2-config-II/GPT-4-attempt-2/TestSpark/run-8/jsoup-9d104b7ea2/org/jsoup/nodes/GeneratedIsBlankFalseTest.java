package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;

public class GeneratedIsBlankFalseTest {

    @Test
    public void isBlankFalseTest() {
        String text = "Test text";
        TextNode textNode = new TextNode(text);
        assertFalse(textNode.isBlank());
    }

}