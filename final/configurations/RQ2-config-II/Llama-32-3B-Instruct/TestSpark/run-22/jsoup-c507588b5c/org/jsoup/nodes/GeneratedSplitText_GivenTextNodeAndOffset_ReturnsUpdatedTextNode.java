package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedSplitText_GivenTextNodeAndOffset_ReturnsUpdatedTextNode {

    @Test
    public void splitText_GivenTextNodeAndOffset_ReturnsUpdatedTextNode() {
        TextNode node = new TextNode("Hello World");
        int offset = 6;
        TextNode updatedNode = node.splitText(offset);
        assertEquals("World", updatedNode.text());
    }

}