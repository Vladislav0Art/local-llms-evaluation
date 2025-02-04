package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedCreateFromEncoded_GivenEncodedString_ReturnsTextNodeWithUnescapedData {

    @Test
    public void createFromEncoded_GivenEncodedString_ReturnsTextNodeWithUnescapedData() {
        String encodedText = "&lt;test&gt;";
        TextNode textNode = TextNode.createFromEncoded(encodedText);
        assertNotNull(textNode);
        assertEquals("test", textNode.text());
    }

}