package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedGetWholeTextReturnsCompleteTextContent {

    @Test
    public void getWholeTextReturnsCompleteTextContent() {
        TextNode textNode = new TextNode("Hello World");
        String expectedText = "Hello World";
        assertEquals(expectedText, textNode.getWholeText());
    }

}