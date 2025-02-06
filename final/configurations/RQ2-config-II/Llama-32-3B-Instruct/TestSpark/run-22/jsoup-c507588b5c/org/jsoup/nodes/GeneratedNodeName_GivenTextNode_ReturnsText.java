package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedNodeName_GivenTextNode_ReturnsText {

    @Test
    public void nodeName_GivenTextNode_ReturnsText() {
        TextNode node = new TextNode("test");
        assertEquals("text", node.nodeName());
    }

}