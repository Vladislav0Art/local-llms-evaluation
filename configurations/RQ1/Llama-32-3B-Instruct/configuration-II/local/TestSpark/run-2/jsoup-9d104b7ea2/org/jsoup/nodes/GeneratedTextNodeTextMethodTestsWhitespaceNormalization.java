package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.mockito.Mockito.when;

public class GeneratedTextNodeTextMethodTestsWhitespaceNormalization {

    @Test
    public void textNodeTextMethodTestsWhitespaceNormalization() {
        // Given a new TextNode with whitespace normalized text
        TextNode textNode = new TextNode("   Hello World  ");

        // When we call the text() method on it
        String result = textNode.text();

        // Then the result should be "Hello World"
        assertEquals("Hello World", result);
    }

}