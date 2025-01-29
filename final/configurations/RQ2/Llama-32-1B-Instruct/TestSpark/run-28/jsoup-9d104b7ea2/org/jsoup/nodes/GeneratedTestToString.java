package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTestToString {

    @Test
    public void testToString() {
        String text = "test";
        TextNode node = new TextNode(text);
        assertNotNull(node.toString());
        assertEquals("text", node.toString());
    }

}