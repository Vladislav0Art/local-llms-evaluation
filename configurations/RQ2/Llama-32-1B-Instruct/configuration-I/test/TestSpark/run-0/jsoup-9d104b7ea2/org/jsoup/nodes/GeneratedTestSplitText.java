package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestSplitText {

    public TextNode createNode() {
        return new TextNode("Hello World");
    }

    @Test
    public void testSplitText() {
        TextNode node = createNode();
        assertEquals("Hello", node.getWholeText().split(2)[0]);
        assertEquals("World", node.getWholeText().split(2)[1]);
    }

}