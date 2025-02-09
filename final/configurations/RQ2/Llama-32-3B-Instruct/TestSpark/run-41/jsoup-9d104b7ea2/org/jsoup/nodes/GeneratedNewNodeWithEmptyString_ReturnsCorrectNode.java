package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedNewNodeWithEmptyString_ReturnsCorrectNode {

    @Test
    public void newNodeWithEmptyString_ReturnsCorrectNode() {
        TextNode node = new TextNode("");
        assertNotNull(node);
    }

}