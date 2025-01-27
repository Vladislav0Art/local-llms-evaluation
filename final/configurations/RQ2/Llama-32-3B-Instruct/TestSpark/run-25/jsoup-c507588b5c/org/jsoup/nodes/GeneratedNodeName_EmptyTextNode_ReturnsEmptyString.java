package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNodeName_EmptyTextNode_ReturnsEmptyString {

    @Test
    public void nodeName_EmptyTextNode_ReturnsEmptyString() {
        TextNode node = new TextNode("");
        assertEquals("", node.nodeName());
    }

}