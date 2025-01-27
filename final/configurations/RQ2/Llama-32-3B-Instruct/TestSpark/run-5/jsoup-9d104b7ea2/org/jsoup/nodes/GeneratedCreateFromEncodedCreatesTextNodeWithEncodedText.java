package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;

public class GeneratedCreateFromEncodedCreatesTextNodeWithEncodedText {

    @Test
    public void createFromEncodedCreatesTextNodeWithEncodedText() {
        String encodedText = "encodedText";
        TextNode node = TextNode.createFromEncoded(encodedText);
        assertEquals(encodedText, node.text());
    }

}