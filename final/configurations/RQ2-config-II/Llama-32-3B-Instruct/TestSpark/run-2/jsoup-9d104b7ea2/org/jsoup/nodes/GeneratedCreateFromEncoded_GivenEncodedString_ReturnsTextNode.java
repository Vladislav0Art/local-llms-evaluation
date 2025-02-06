package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

public class GeneratedCreateFromEncoded_GivenEncodedString_ReturnsTextNode {

    @Test
    public void createFromEncoded_GivenEncodedString_ReturnsTextNode() {
        String encodedText = "text";
        TextNode textNode = TextNode.createFromEncoded(encodedText);
        assertNotNull(textNode);
        assertEquals(encodedText, textNode.text());
    }

}