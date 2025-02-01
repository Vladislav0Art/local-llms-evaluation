package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSplitTextTest {

    @Test
    public void splitTextTest() {
        TextNode textNode = new TextNode("test text");
        TextNode splitTextNode = textNode.splitText(4);
        assertEquals("test", textNode.getWholeText());
        assertEquals(" text", splitTextNode.getWholeText());
    }

}