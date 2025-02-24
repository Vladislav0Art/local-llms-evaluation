package org.jsoup.nodes;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class GeneratedTestNodeName {

    private TextNode textNode;

    @Test
    public void testNodeName() {
        textNode = new TextNode("");
        assertEquals("#text", textNode.nodeName());
    }

}