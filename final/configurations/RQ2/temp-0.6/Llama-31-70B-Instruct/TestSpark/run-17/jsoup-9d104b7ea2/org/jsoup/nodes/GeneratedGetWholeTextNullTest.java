package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedGetWholeTextNullTest {

    @Test
    public void getWholeTextNullTest() {
        TextNode textNode = new TextNode(null);
        assertEquals("", textNode.getWholeText());
    }

}