package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document.OutputSettings;

import static org.junit.Assert.*;

public class GeneratedTextGetterTest {

    @Test
    public void textGetterTest() {
        TextNode textNode = new TextNode("hello");
        assertEquals("hello", textNode.text());
    }

}