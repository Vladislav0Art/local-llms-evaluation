package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedNewTextNode_GivenText_ReturnsNewTextNode {

    @Test
    public void newTextNode_GivenText_ReturnsNewTextNode() {
        String text = "test";
        TextNode textNode = new TextNode(text);
        assertNotNull(textNode);
    }

}