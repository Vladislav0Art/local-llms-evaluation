package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedCreateFromEncoded_DecodedTextIsOriginalContent {

    @Test
    public void createFromEncoded_DecodedTextIsOriginalContent() throws IOException {
        String encodedText = "UTF-8Hello World";
        TextNode node = TextNode.createFromEncoded(encodedText);
        assertEquals("Hello World", node.text());
    }

}