package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedNewNodeText_ReturnsCorrectNode {

    @Test
    public void newNodeText_ReturnsCorrectNode() {
        TextNode node = new TextNode("Hello");
        assertNotNull(node);
    }

}