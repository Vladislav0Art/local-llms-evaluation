package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.TextNode;

public class GeneratedIsBlank Test {

    @Test
    public void isBlank

    Test() {
        String text = "";
        assertTrue(TextNode.isBlank(text));
        assertFalse(TextNode.isBlank("Hello"));
    }

}