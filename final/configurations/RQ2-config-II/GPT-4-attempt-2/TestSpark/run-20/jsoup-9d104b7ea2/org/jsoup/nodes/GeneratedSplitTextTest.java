package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSplitTextTest {

    @Test
    public void splitTextTest() {
        TextNode tn = new TextNode("Hello");
        TextNode split = tn.splitText(2);
        assertEquals("llo", split.getWholeText());
    }

}