package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedCreateFromEncodedMethodTest {

    @Test
    public void createFromEncodedMethodTest() throws IOException {
        String encodedText = "&lt;Hello World&gt;";
        TextNode textNode = TextNode.createFromEncoded(encodedText);

        assertEquals("Hello World", textNode.text());
    }

}