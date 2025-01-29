package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestSplitText {

    @Test
    public void testSplitText() {
        String text = "Hello World";
        TextNode node = new TextNode(text);
        assertEquals(4, node.splitText(0).getWholeText().length());
    }

}