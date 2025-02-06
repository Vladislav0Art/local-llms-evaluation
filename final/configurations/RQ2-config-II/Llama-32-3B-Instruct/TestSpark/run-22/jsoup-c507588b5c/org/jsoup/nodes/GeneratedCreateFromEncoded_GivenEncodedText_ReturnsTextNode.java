package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedCreateFromEncoded_GivenEncodedText_ReturnsTextNode {

    @Test
    public void createFromEncoded_GivenEncodedText_ReturnsTextNode() {
        String encodedText = "Hello%20World";
        TextNode node = TextNode.createFromEncoded(encodedText);
        assertNotNull(node);
        assertEquals(encodedText, node.text());
    }

}