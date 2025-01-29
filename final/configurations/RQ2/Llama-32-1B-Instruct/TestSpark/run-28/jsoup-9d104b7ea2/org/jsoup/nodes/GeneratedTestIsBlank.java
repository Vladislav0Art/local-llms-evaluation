package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTestIsBlank {

    @Test
    public void testIsBlank() {
        String text = "";
        TextNode node = new TextNode(text);
        assertTrue(node.isBlank());
    }

}