package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertSame;
import static org.mockito.Mockito.verify;

public class GeneratedTestToString {

    @Test
    public void testToString() {
        TextNode node = new TextNode("Hello World");
        assertEquals("<text> Hello World </text>", node.toString());
    }

}