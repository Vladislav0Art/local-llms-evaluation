package org.jsoup.nodes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.mockito.Mockito;
import org.jsoup.nodes.TextNode;

public class GeneratedTestNodeName {

    @Test
    public void testNodeName() {
        TextNode textNode = new TextNode("Text");
        assertEquals("#text", textNode.nodeName());
    }

}