package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNormaliseWhitespace {

    @Test
    public void normaliseWhitespace() {
        String text = "  Hello  world  ";
        String expectedText = "Hello world";
        assertEquals(expectedText, TextNode.normaliseWhitespace(text));
    }

}