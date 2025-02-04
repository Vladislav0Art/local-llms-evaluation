package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;

public class GeneratedIsBlank_NoWhitespace_Succeeds {

    @Test
    public void isBlank_NoWhitespace_Succeeds() {
        String originalText = "Hello World";
        TextNode textNode = new TextNode(originalText);
        assertFalse(textNode.isBlank());
    }

}