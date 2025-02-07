package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestSplitText_WithOffset {

    @Test
    public void testSplitText_WithOffset() {
        TextNode textNode = new TextNode("Hello World");
        assertEquals(6, textNode.splitText(4).text().length());
    }

}