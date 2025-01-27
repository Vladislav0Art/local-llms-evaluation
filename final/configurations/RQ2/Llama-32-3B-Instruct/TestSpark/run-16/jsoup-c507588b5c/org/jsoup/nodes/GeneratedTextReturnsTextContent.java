package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedTextReturnsTextContent {

    @Test
    public void textReturnsTextContent() {
        TextNode textNode = new TextNode("Hello World");
        String expectedText = "Hello World";
        assertEquals(expectedText, textNode.text());
    }

}