package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSplitTextTest {

    @Test
    public void splitTextTest() {
        TextNode textNode = new TextNode("test");
        TextNode result = textNode.splitText(2);
        assertNotNull(result);
        assertEquals("st", result.text());
        assertEquals("te", textNode.text());
    }

}