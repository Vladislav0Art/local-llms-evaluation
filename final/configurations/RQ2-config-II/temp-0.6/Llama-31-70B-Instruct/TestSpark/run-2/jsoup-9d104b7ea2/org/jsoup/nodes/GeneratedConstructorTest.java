package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedConstructorTest {

    // test constructor with mocked TextNode

    @Test
    public void constructorTest() {
        TextNode textNode = Mockito.mock(TextNode.class);
        assertEquals(textNode, new TextNode("text"));
    }

}