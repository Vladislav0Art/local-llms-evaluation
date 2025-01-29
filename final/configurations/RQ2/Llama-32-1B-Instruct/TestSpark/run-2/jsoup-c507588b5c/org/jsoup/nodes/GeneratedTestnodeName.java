package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestnodeName {

    @Test
    public void testnodeName() {
        TextNode node = new TextNode("Hello");
        assertEquals("text", node.nodeName());
    }

}