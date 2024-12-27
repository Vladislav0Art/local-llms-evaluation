package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;

public class GeneratedCreateTextNodeFromSingleCharacter_ReturnsSingleCharTextNode {

    @Test
    public void createTextNodeFromSingleCharacter_ReturnsSingleCharTextNode() {
        String charStr = "a";
        TextNode textNode = TextNode.createFromEncoded(charStr);
        assertEquals(1, textNode.text().length());
    }

}