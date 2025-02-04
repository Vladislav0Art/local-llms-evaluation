package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;

public class GeneratedCreateTextNode_GivenEncodedText_ReturnsCorrectTextNode {

    @Test
    public void createTextNode_GivenEncodedText_ReturnsCorrectTextNode() {
        String encodedText = "&lt;Hello&gt;, &amp;World!&amp;";
        TextNode textNode = TextNode.createFromEncoded(encodedText);
        assertNotNull(textNode);
        assertEquals("Hello, World!", textNode.text());
    }

}