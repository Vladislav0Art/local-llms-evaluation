package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetNodeNameIsNotEmptyNonEmptyTextNode {

    @Test
    public void getNodeNameIsNotEmptyNonEmptyTextNode() {
        String text = "not empty";
        TextNode textNode = new TextNode(text);
        assertEquals(text, textNode.nodeName());
    }

}