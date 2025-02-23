package org.jsoup.nodes;

import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSplitTextTest {

    @Test
    public void splitTextTest() {
        TextNode textNode = new TextNode("Hello World");
        TextNode splitTextNode = textNode.splitText(4);
        assertEquals("Hello", textNode.coreValue());
        assertEquals(" World", splitTextNode.coreValue());
    }

}