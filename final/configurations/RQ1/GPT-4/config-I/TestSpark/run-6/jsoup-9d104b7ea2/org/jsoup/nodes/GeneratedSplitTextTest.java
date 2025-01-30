package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSplitTextTest {

    @Test
    public void splitTextTest() {
        String text = "testtest";
        int offset = 4;
        TextNode headNode = new TextNode(text);
        TextNode tailNode = headNode.splitText(offset);
        assertEquals("test", headNode.getWholeText());
        assertEquals("test", tailNode.getWholeText());
    }

}