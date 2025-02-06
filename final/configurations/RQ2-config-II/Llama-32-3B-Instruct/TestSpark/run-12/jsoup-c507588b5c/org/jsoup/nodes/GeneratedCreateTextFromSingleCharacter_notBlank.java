package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;

public class GeneratedCreateTextFromSingleCharacter_notBlank {

    @Test
    public void createTextFromSingleCharacter_notBlank() {
        TextNode textNode = TextNode.createFromEncoded("a");
        assertFalse(textNode.isBlank());
    }

}