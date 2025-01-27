package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.TextNode;

public class GeneratedCreateFromEncodedStringTextNode_Test {

    @Test
    public void createFromEncodedStringTextNode_Test() {
        String encodedText = "encoded%20text";
        TextNode textNode = TextNode.createFromEncoded(encodedText);
        assertNotNull(textNode);
    }

}