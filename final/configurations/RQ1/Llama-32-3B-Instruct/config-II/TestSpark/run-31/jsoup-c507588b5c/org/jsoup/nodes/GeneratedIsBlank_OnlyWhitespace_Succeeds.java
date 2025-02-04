package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;

public class GeneratedIsBlank_OnlyWhitespace_Succeeds {

    @Test
    public void isBlank_OnlyWhitespace_Succeeds() {
        String originalText = "   ";
        TextNode textNode = new TextNode(originalText);
        assertTrue(textNode.isBlank());
    }

}