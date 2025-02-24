package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedIsBlankTest {

    // test constructor with mocked TextNode

    @Test
    public void isBlankTest() {
        TextNode textNode = Mockito.mock(TextNode.class);
        Mockito.when(textNode.isBlank()).thenReturn(false);
        assertFalse(textNode.isBlank());
    }

}