package org.jsoup.nodes;

import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class GeneratedTextSetterTest {

    @Test
    public void textSetterTest() {
        // Given
        String text = "test";
        TextNode textNode = new TextNode(text);

        // When
        TextNode returnedTextNode = textNode.text("new test");

        // Then
        assertEquals("new test", returnedTextNode.text());
    }

}