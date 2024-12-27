package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class GeneratedSplitTextTest {

    @Test
    public void splitTextTest() {
        TextNode textNode = new TextNode("HelloWorld");
        TextNode splitNode = textNode.splitText(5);
        assertEquals("Hello", textNode.getWholeText());
        assertEquals("World", splitNode.getWholeText());
    }

}