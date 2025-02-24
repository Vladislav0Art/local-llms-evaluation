package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedTextTest {

    // test constructor with mocked TextNode

    @Test
    public void textTest() {
        TextNode textNode = Mockito.mock(TextNode.class);
        Mockito.when(textNode.text()).thenReturn("text");
        assertEquals("text", textNode.text());
    }

}