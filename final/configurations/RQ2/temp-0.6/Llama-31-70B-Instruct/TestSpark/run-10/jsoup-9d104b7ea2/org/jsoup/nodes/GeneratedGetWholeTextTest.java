package org.jsoup.nodes;

import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class GeneratedGetWholeTextTest {

    @Test
    public void getWholeTextTest() {
        // Given
        String text = "test";
        TextNode textNode = new TextNode(text);

        // When
        String wholeText = textNode.getWholeText();

        // Then
        assertEquals(text, wholeText);
    }

}