package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;

public class GeneratedText_GivenEncodedTextNode_ReturnsCorrectText {

    @Test
    public void text_GivenEncodedTextNode_ReturnsCorrectText() {
        String encodedText = "&lt;Hello&gt;, &amp;World!&amp;";
        TextNode textNode = TextNode.createFromEncoded(encodedText);
        String expectedText = "Hello, World!";
        assertEquals(expectedText, textNode.text());
    }

}