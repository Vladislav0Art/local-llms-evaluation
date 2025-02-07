package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestClone {

    private TextNode rootNode;

    @Test
    public void testClone() {
        rootNode = new TextNode("Hello World");
        assertNotNull(rootNode.clone());
    }

}