package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTestText {

    @Test
    public void testText() {
        String text = "test";
        TextNode node = new TextNode(text);
        assertNotNull(node.text());
        assertEquals(text, node.text());
    }

}