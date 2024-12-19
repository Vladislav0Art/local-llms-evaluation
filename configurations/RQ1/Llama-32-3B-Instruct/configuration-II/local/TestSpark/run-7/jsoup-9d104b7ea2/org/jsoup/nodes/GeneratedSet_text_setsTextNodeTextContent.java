package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;

public class GeneratedSet_text_setsTextNodeTextContent {

    @Test
    public void set_text_setsTextNodeTextContent() {
        // [MethodUnderTest][Scenario]Test
        String text = "Hello World";
        TextNode textNode = new TextNode();
        textNode.text(text);
        assertEquals("Hello World", textNode.coreValue());
    }

}