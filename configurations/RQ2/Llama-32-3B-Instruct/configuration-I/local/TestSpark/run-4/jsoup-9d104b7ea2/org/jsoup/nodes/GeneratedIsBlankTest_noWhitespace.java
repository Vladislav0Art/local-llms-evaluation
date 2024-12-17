package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsBlankTest_noWhitespace {

    @Test
    public void isBlankTest_noWhitespace() {
        String text = "Hello";
        TextNode textNode = new TextNode(text);
        assertFalse(textNode.isBlank());
    }

}