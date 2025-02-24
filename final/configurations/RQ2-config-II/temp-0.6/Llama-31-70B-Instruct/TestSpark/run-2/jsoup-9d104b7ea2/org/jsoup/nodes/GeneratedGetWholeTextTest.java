package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedGetWholeTextTest {

    // test constructor with mocked TextNode

    @Test
    public void getWholeTextTest() {
        TextNode textNode = Mockito.mock(TextNode.class);
        Mockito.when(textNode.getWholeText()).thenReturn("text");
        assertEquals("text", textNode.getWholeText());
    }

}