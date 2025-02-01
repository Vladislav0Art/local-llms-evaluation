package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSplitTextTest {

    @Test
    public void splitTextTest() {
        TextNode textNode = new TextNode("Test");
        TextNode splitTextNode = textNode.splitText(2);
        assertEquals("Te", textNode.getWholeText());
        assertEquals("st", splitTextNode.getWholeText());
    }

}