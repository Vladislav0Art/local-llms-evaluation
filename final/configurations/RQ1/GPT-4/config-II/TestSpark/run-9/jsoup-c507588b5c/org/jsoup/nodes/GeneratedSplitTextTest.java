package org.jsoup.nodes;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

public class GeneratedSplitTextTest {

    @Test
    public void splitTextTest() {
        String text = "Sample text";
        TextNode textNode = new TextNode(text);
        TextNode splitNode = textNode.splitText(6);
        assertEquals("Sample", textNode.getWholeText());
        assertEquals(" text", splitNode.getWholeText());
    }

}