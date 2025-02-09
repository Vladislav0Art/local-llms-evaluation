package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedCreateFromEncoded_ReturnsCorrectTextNode {

    @Test
    public void createFromEncoded_ReturnsCorrectTextNode() {
        String encodedText = "<p>Hello</p>";
        TextNode node = TextNode.createFromEncoded(encodedText);
        assertNotNull(node);
        assertEquals(encodedText, node.text());
    }

}