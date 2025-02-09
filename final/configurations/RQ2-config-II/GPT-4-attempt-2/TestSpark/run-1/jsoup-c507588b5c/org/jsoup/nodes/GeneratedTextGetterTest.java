package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTextGetterTest {

    @Test
    public void textGetterTest() {
        TextNode textNode = new TextNode("sample text");
        assertEquals("sample text", textNode.text());
    }

}