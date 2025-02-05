package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;

import static org.junit.Assert.*;

public class GeneratedSplitTextTest {

    @Test
    public void splitTextTest() {
        TextNode tn = new TextNode("testing");
        TextNode split = tn.splitText(4);
        assertEquals("test", tn.getWholeText());
        assertEquals("ing", split.getWholeText());
    }

}