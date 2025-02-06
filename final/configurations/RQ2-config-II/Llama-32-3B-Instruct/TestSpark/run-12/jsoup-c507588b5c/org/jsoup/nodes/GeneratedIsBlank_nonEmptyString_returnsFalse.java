package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;

public class GeneratedIsBlank_nonEmptyString_returnsFalse {

    @Test
    public void isBlank_nonEmptyString_returnsFalse() {
        String originalText = "Hello World";
        TextNode textNode = new TextNode(originalText);
        assertFalse(textNode.isBlank());
    }

}