package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;

public class GeneratedCreateTextFromEmptyString_isBlank {

    @Test
    public void createTextFromEmptyString_isBlank() {
        TextNode textNode = TextNode.createFromEncoded("");
        assertTrue(textNode.isBlank());
    }

}