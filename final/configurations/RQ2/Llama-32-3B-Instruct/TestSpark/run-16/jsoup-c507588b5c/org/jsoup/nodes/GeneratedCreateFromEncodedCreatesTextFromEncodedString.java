package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedCreateFromEncodedCreatesTextFromEncodedString {

    @Test
    public void createFromEncodedCreatesTextFromEncodedString() {
        String encodedText = "Hello World!";
        TextNode textNode = TextNode.createFromEncoded(encodedText);
        String expectedText = encodedText;
        assertEquals(expectedText, textNode.text());
    }

}