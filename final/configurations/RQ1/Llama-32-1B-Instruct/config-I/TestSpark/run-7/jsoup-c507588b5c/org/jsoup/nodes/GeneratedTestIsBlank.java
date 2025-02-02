package org.jsoup.nodes;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class GeneratedTestIsBlank {

    @Test
    public void testIsBlank() {
        TextNode textNode = new TextNode("");
        assertTrue(textNode.isBlank());
        assertFalse(textNode.isBlank());
    }

}