package org.jsoup.nodes;

import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void createFromEncodedTest() {
        // Given
        String encodedText = "test";

        // When
        TextNode textNode = TextNode.createFromEncoded(encodedText);

        // Then
        assertEquals("test", textNode.text());
    }

    @Test
    public void nodeNameTest() {
        // Given
        String text = "test";

        // When
        TextNode textNode = new TextNode(text);

        // Then
        assertEquals("#text", textNode.nodeName());
    }

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