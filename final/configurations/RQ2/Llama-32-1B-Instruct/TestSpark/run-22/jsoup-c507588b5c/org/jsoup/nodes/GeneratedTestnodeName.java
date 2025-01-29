package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertSame;
import static org.mockito.Mockito.verify;

public class GeneratedTestnodeName {

    @Test
    public void testnodeName() {
        TextNode node = new TextNode("Hello");
        assertEquals(TextNode.class, node.getClass());
    }

}