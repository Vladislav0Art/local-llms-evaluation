package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedTextNullTest {

    @Test
    public void textNullTest() {
        TextNode textNode = new TextNode(null);
        assertEquals("", textNode.text());
    }

}