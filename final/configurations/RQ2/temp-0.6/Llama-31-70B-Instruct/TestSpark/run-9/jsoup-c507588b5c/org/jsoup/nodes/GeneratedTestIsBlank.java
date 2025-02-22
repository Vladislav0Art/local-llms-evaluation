package org.jsoup.nodes;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.Assert.assertEquals;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

public class GeneratedTestIsBlank {

    @Test
    public void testIsBlank() {
        TextNode textNode = new TextNode("");
        assertEquals(true, textNode.isBlank());
    }

}