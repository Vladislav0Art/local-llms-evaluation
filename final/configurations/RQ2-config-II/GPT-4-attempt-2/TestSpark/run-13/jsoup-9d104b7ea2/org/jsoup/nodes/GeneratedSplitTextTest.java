package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSplitTextTest {

    @Test
    public void splitTextTest() {
        TextNode textNode = new TextNode("TestSplit");
        TextNode splittedNode = textNode.splitText(4);

        assertEquals("Test", textNode.getWholeText());
        assertEquals("Split", splittedNode.getWholeText());
    }

}