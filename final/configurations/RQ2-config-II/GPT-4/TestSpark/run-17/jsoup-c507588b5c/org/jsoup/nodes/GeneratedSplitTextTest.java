package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;

import static org.junit.Assert.*;

public class GeneratedSplitTextTest {

    @Test
    public void splitTextTest() {
        TextNode tn = new TextNode("original text");
        TextNode newTn = tn.splitText(9);
        assertEquals("original ", tn.text());
        assertEquals("text", newTn.text());
    }

}