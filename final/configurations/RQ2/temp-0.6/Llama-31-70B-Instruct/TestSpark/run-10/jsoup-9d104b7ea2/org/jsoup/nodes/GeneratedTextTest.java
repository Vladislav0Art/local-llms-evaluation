package org.jsoup.nodes;

import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class GeneratedTextTest {

    @Test
    public void textTest() {
        // Given
        String text = "test";
        TextNode textNode = new TextNode(text);

        // When
        String returnedText = textNode.text();

        // Then
        assertEquals(text, returnedText);
    }

}