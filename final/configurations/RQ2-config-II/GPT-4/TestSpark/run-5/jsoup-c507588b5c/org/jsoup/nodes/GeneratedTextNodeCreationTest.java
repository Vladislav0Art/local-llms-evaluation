package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTextNodeCreationTest {

    @Test
    public void TextNodeCreationTest() {
        TextNode textNode = new TextNode("test");
        assertNotNull(textNode);
        assertEquals("test", textNode.text());
    }

}