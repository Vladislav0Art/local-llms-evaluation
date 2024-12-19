package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedCloneTextNode_ReturnsNewTextNodeWithSameContent {

    @Test
    public void cloneTextNode_ReturnsNewTextNodeWithSameContent() {
        String text = "Hello World!";
        TextNode textNode = new TextNode(text);
        TextNode clonedTextNode = textNode.clone();
        assertEquals(text, clonedTextNode.text());
    }

}