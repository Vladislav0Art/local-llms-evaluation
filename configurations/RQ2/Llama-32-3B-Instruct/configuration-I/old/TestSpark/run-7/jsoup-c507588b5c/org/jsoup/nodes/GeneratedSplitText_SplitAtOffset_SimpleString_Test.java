package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSplitText_SplitAtOffset_SimpleString_Test {

    @Test
    public void splitText_SplitAtOffset_SimpleString_Test() throws Exception {
        TextNode textNode = new TextNode("Hello World");
        TextNode node1 = (TextNode) mockText();
        TextNode node2 = (TextNode) mockText();
        int offset = 6;
        assertEquals(node1, ((TextNode) mockText()).splitText(offset));
    }

}