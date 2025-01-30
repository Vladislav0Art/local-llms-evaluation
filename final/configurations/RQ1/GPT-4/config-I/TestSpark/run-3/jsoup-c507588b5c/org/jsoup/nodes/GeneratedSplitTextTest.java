package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSplitTextTest {

    @Test
    public void splitTextTest() {
        TextNode tn = new TextNode("test");
        TextNode splitNode = tn.splitText(2);
        assertEquals("te", tn.getWholeText());
        assertEquals("st", splitNode.getWholeText());
    }

}