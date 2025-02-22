package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedSplitTextTextNodeTest {

    @Test
    public void splitTextTextNodeTest() {
        TextNode textNode = new TextNode("text");
        TextNode splitTextNode = textNode.splitText(2);
        assertEquals("te", textNode.getWholeText());
        assertEquals("xt", splitTextNode.getWholeText());
    }

}