package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

public class GeneratedCreateFromEncoded_EncodedTextCreation {

    @Test
    public void createFromEncoded_EncodedTextCreation() {
        String encodedText = "Hello World";
        TextNode node = TextNode.createFromEncoded(encodedText);

        assertNotNull(node);
        assertEquals("Hello World", node.text());
    }

}