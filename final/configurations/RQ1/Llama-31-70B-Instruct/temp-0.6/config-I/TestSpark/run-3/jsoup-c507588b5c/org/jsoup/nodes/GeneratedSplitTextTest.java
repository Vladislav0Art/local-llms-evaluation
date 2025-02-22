package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedSplitTextTest {

    @Test
    public void splitTextTest() {
        TextNode textNode = new TextNode("test");
        TextNode tailNode = textNode.splitText(1);
        assertEquals("tes", textNode.coreValue());
        assertEquals("t", tailNode.coreValue());
    }

}