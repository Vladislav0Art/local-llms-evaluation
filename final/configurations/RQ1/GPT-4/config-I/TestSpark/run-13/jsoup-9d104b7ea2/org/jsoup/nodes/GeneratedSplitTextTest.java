package org.jsoup.nodes;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;
import org.junit.Test;
import org.jsoup.nodes.Element;

import java.io.IOException;

public class GeneratedSplitTextTest {

    @Test
    public void splitTextTest() {
        String testString = "Test text";
        TextNode node = new TextNode(testString);
        TextNode splitNode = node.splitText(4);
        assertEquals(node.getWholeText(), "Test");
        assertEquals(splitNode.getWholeText(), " text");
    }

}