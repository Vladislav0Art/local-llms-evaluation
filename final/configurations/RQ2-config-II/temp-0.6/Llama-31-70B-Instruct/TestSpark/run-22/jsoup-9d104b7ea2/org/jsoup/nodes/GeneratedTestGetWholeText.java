package org.jsoup.nodes;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class GeneratedTestGetWholeText {

    private TextNode textNode;

    @Test
    public void testGetWholeText() {
        textNode = new TextNode("text");
        assertEquals("text", textNode.getWholeText());
    }

}