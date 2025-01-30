package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedSplitTextTest {

    @Test
    public void splitTextTest() {
        TextNode tn = new TextNode("Hello World");
        TextNode splittedNode = tn.splitText(6);
        assertEquals("Hello ", tn.getWholeText());
        assertEquals("World", splittedNode.getWholeText());
    }

}