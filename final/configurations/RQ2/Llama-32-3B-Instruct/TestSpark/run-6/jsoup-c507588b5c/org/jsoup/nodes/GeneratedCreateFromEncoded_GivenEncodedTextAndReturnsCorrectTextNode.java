package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class GeneratedCreateFromEncoded_GivenEncodedTextAndReturnsCorrectTextNode {

    @Test
    public void createFromEncoded_GivenEncodedTextAndReturnsCorrectTextNode() {
        String encodedText = "text";
        TextNode textNode = TextNode.createFromEncoded(encodedText);
        assertEquals(encodedText, textNode.text());
    }

}