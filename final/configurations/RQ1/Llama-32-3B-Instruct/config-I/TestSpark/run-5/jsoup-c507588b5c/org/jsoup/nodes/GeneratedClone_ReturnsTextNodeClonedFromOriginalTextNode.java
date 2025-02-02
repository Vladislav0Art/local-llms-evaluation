package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedClone_ReturnsTextNodeClonedFromOriginalTextNode {

    @Test
    public void Clone_ReturnsTextNodeClonedFromOriginalTextNode() {
        TextNode originalTextNode = new TextNode("");
        TextNode clonedTextNode = originalTextNode.clone();
        assertNotNull(clonedTextNode);
        assertTrue(clonedTextNode instanceof TextNode);
    }

}