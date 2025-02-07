package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestSplitText {

    private TextNode rootNode;

    @Test
    public void testSplitText() {
        rootNode = new TextNode("Hello World");
        assertEquals(6, rootNode.splitText(0).length);
    }

}