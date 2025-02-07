package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestnodeName {

    @Test
    public void testnodeName() {
        TextNode textNode = new TextNode("Hello World");
        assertEquals("TEXT_NODE", textNode.nodeName());
    }

}