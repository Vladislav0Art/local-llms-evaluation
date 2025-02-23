package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

public class GeneratedTextNodeTest {

    @Test
    public void textNodeTest() {
        TextNode textNode = new TextNode("text");
        assertEquals("#text", textNode.nodeName());
        assertEquals("text", textNode.text());
        assertEquals("text", textNode.getWholeText());
        textNode.text("newText");
        assertEquals("newText", textNode.text());
        assertEquals("newText", textNode.getWholeText());
    }

}