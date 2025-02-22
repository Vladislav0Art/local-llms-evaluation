package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

public class GeneratedTestGetWholeText {

    @Test
    public void testGetWholeText() {
        TextNode node = new TextNode("test");
        assertEquals("test", node.getWholeText());
    }

}