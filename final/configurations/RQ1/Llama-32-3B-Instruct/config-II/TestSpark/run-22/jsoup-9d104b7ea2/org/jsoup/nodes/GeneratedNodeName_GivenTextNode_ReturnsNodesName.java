package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedNodeName_GivenTextNode_ReturnsNodesName {

    @Test
    public void nodeName_GivenTextNode_ReturnsNodesName() {
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        assertEquals("#text", textNode.nodeName());
    }

}