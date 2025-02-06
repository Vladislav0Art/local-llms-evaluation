package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetNodeNameIsEmptyTextNode {

    @Test
    public void getNodeNameIsEmptyTextNode() {
        TextNode textNode = new TextNode("");
        assertEquals("", textNode.nodeName());
    }

}