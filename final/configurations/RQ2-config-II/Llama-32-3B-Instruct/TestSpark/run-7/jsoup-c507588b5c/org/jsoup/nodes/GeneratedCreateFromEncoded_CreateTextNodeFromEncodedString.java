package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class GeneratedCreateFromEncoded_CreateTextNodeFromEncodedString {

    @Test
    public void createFromEncoded_CreateTextNodeFromEncodedString() throws IOException {
        // Arrange & Act
        String encodedText = "Hello";
        TextNode result = TextNode.createFromEncoded(encodedText);

        // Assert
        assertNotNull(result);
        assertEquals(encodedText, result.text());
    }

}