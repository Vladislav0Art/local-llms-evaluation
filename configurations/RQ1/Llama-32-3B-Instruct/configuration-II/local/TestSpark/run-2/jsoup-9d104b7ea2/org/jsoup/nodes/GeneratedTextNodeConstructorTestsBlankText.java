package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.mockito.Mockito.when;

public class GeneratedTextNodeConstructorTestsBlankText {

    @Test
    public void textNodeConstructorTestsBlankText() {
        // Given a new TextNode with blank text
        TextNode textNode = new TextNode("");

        // When we call the text() method on it
        String result = textNode.text();

        // Then the result should be an empty string
        assertEquals("", result);
    }

}