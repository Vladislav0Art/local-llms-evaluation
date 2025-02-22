package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestNodeName {

    @Test
    public void testNodeName() {
        TextNode textNode = new TextNode("test");
        String nodeName = textNode.nodeName();
        assertEquals("#text", nodeName);
    }

}