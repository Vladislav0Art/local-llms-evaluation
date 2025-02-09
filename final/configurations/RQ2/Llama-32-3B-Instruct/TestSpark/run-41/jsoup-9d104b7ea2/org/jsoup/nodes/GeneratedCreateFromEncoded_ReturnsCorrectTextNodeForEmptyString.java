package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedCreateFromEncoded_ReturnsCorrectTextNodeForEmptyString {

    @Test
    public void createFromEncoded_ReturnsCorrectTextNodeForEmptyString() {
        String encodedText = "<p></p>";
        TextNode node = TextNode.createFromEncoded(encodedText);
        assertNotNull(node);
        assertEquals(encodedText, node.text());
    }

}