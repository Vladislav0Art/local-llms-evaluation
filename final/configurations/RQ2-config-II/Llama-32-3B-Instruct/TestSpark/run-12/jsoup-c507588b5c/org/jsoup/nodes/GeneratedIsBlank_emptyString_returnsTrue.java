package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;

public class GeneratedIsBlank_emptyString_returnsTrue {

    @Test
    public void isBlank_emptyString_returnsTrue() {
        TextNode textNode = TextNode.createFromEncoded("");
        assertTrue(textNode.isBlank());
    }

}