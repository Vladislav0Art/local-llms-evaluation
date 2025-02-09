package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;

public class GeneratedIsBlankTrueTest {

    @Test
    public void isBlankTrueTest() {
        String text = "    ";
        TextNode textNode = new TextNode(text);
        assertTrue(textNode.isBlank());
    }

}