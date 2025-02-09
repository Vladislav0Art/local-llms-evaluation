package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSplitTextTest {

    @Test
    public void splitTextTest() {
        TextNode tn = new TextNode("test text");
        TextNode tnSplit = tn.splitText(4);
        assertEquals("test", tn.getWholeText());
        assertEquals(" text", tnSplit.getWholeText());
    }

}