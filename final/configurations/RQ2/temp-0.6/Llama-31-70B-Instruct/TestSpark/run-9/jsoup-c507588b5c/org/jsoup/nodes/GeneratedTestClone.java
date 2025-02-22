package org.jsoup.nodes;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.Assert.assertEquals;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

public class GeneratedTestClone {

    @Test
    public void testClone() {
        TextNode textNode = new TextNode("test");
        TextNode textNode2 = (TextNode) textNode.clone();
        assertEquals("test", textNode2.getWholeText());
    }

}