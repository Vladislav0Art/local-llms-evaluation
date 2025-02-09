package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;

public class GeneratedCreateFromEncodedTextTest {

    @Test
    public void createFromEncodedTextTest() {
        String encodedText = "Hello";
        TextNode node = TextNode.createFromEncoded(encodedText);
        assertEquals(encodedText, node.text());
    }

}