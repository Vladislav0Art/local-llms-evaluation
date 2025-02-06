package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetTextIsEmptyTextNode {

    @Test
    public void getTextIsEmptyTextNode() {
        TextNode textNode = new TextNode("");
        assertEquals("", textNode.text());
    }

}