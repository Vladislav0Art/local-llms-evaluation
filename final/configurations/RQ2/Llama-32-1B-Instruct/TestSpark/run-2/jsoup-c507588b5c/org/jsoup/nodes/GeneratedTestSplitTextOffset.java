package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestSplitTextOffset {

    @Test
    public void testSplitTextOffset() {
        TextNode node = new TextNode("Hello World");
        assertEquals(Arrays.asList("Hello", "World"), node.splitText(0));
        assertEquals(Arrays.asList("Hello", "World"), node.splitText(2));
    }

}