package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedSplitText_splitsCorrectly {

    @Test
    public void splitText_splitsCorrectly() throws IOException {
        TextNode node = new TextNode("Hello World");
        TextNode expectedLeft = new TextNode("Hello ");
        TextNode expectedRight = new TextNode("World");
        assertEquals(expectedLeft, node.splitText(0));
        assertEquals(expectedRight, node.splitText(node.text().length()));
    }

}