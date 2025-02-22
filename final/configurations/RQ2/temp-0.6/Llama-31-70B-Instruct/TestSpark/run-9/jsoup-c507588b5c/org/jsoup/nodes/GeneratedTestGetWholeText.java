package org.jsoup.nodes;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.Assert.assertEquals;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

public class GeneratedTestGetWholeText {

    @Test
    public void testGetWholeText() {
        TextNode textNode = new TextNode("test");
        assertEquals("test", textNode.getWholeText());
    }

}