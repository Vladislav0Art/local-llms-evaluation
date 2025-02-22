package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

public class GeneratedTestNodeName {

    @Test
    public void testNodeName() {
        TextNode node = new TextNode("test");
        assertEquals("#text", node.nodeName());
    }

}