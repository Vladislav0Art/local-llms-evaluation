package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSplitTextTest {

    @Test
    public void splitTextTest() {
        TextNode textNode = new TextNode("hello world");
        TextNode splitNode = textNode.splitText(6);

        assertEquals("hello ", textNode.getWholeText());
        assertEquals("world", splitNode.getWholeText());
    }

}