package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

import java.util.List;

public class GeneratedTestnodeName {

    private TextNode textNode = new TextNode("Hello World");

    @Test
    public void testnodeName() {
        assertEquals("TEXT_NODE", textNode.nodeName());
    }

}