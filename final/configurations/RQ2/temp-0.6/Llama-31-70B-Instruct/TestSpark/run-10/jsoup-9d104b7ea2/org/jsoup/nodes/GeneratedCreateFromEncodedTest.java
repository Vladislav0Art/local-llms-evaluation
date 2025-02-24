package org.jsoup.nodes;

import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class GeneratedCreateFromEncodedTest {

    @Test
    public void createFromEncodedTest() {
        // Given
        String encodedText = "test";

        // When
        TextNode textNode = TextNode.createFromEncoded(encodedText);

        // Then
        assertEquals("test", textNode.text());
    }

}