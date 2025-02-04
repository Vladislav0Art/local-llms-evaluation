package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedCreateFromEncoded_CreateTextNodeFromString_ReturnsTextNode {

    @Test
    public void createFromEncoded_CreateTextNodeFromString_ReturnsTextNode() throws Exception {
        String encodedText = "&lt;Hello World&gt;";
        TextNode textNode = TextNode.createFromEncoded(encodedText);
        assertEquals("Hello World", textNode.getWholeText());
    }

}