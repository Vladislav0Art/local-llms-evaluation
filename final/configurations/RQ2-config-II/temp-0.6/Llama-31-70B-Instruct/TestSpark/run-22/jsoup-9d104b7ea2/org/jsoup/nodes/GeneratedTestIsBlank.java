package org.jsoup.nodes;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class GeneratedTestIsBlank {

    private TextNode textNode;

    @Test
    public void testIsBlank() {
        textNode = new TextNode("");
        assertTrue(textNode.isBlank());
    }

}