package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

import org.jsoup.helper.Validate;

import static org.mockito.Mockito.*;

public class GeneratedCloneCreatesCorrectTextNode {

    @Test
    public void cloneCreatesCorrectTextNode() {
        TextNode node = mock(TextNode.class);
        when(node.clone()).thenReturn(node);
        TextNode cloned = new LeafNode().clone();
        assertEquals(node, cloned);
    }

}