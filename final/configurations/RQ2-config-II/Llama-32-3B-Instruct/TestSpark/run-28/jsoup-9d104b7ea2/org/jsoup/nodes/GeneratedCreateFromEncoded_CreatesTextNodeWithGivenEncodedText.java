package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.concurrent.ExecutionException;

public class GeneratedCreateFromEncoded_CreatesTextNodeWithGivenEncodedText {

    @Test
    public void createFromEncoded_CreatesTextNodeWithGivenEncodedText() throws IOException {
        String encodedText = "example";
        TextNode newTextNode = TextNode.createFromEncoded(encodedText);
        assertNotNull(newTextNode);
        assertEquals(encodedText, newTextNode.text());
    }

}