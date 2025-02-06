package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedNewNodeTextSplitTest {

    @Test
    public void newNodeTextSplitTest() throws IOException {
        TextNode node = new TextNode("Hello World");
        TextNode split = node.splitText(6);
        assertEquals("World", split.text());
    }

}