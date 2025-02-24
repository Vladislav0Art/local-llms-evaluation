package org.jsoup.nodes;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class GeneratedTestTextSet {

    private TextNode textNode;

    @Test
    public void testTextSet() {
        textNode = new TextNode("");
        textNode.text("text");
        assertEquals("text", textNode.text());
    }

}