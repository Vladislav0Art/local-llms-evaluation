package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedNodeNameTest {

    // test constructor with mocked TextNode

    @Test
    public void nodeNameTest() {
        TextNode textNode = Mockito.mock(TextNode.class);
        Mockito.when(textNode.nodeName()).thenReturn("text");
        assertEquals("text", textNode.nodeName());
    }

}