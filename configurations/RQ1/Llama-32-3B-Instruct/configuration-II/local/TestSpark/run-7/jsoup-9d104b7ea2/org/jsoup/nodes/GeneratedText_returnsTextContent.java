package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;

public class GeneratedText_returnsTextContent {

    @Test
    public void text_returnsTextContent() {
        // [MethodUnderTest][Scenario]Test
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        assertEquals("Hello World", textNode.text());
    }

}