package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class GeneratedSplitTextTest {

    @Test
    public void splitTextTest() {
        TextNode textNode = new TextNode("TestingTextSplit");
        TextNode splitNode = textNode.splitText(7);
        assertEquals("Testing", textNode.text());
        assertEquals("TextSplit", splitNode.text());
    }

}