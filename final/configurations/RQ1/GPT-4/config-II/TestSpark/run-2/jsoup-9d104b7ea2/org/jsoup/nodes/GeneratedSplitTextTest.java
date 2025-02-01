package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSplitTextTest {

    @Test
    public void splitTextTest() {
        TextNode textNode = new TextNode("Hello World");
        TextNode splittedNode = textNode.splitText(6);
        assertEquals("World", splittedNode.getWholeText());
    }

}