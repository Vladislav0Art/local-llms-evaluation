package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

public class GeneratedTestText {

    @Test
    public void testText() {
        TextNode node = new TextNode("test");
        assertEquals("test", node.text());
    }

}