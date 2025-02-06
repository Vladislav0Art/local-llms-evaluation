package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedCreateFromEncoded_createTextNodeFromEncodedTextTest {

    @Test
    public void createFromEncoded_createTextNodeFromEncodedTextTest() {
        String encodedText = "Hello World!";
        TextNode textNode = TextNode.createFromEncoded(encodedText);
        assertNotNull(textNode);
        assertEquals(encodedText, textNode.getWholeText());
    }

}