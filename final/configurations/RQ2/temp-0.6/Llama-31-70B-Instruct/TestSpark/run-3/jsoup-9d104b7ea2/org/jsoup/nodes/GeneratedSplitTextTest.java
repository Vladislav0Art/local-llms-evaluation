package org.jsoup.nodes;

import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

public class GeneratedSplitTextTest {

    @Test
    public void splitTextTest() {
        TextNode textNode = new TextNode("text");
        TextNode splitNode = textNode.splitText(2);
        assertEquals("text", textNode.text());
        assertEquals("xt", splitNode.text());
    }

}