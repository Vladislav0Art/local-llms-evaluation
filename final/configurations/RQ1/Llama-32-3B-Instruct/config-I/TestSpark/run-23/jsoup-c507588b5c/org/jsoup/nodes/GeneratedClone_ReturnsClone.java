package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedClone_ReturnsClone {

    @Test
    public void clone_ReturnsClone() {
        String text = "Hello World!";
        TextNode textNode = new TextNode(text);
        TextNode clonedTextNode = (TextNode) textNode.clone();
        assertNotNull(clonedTextNode);
    }

}