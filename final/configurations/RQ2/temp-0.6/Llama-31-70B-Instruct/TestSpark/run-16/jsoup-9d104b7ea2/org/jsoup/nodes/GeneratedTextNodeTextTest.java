package org.jsoup.nodes;

import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class GeneratedTextNodeTextTest {

    @Test
    public void textNodeTextTest() {
        TextNode textNode = new TextNode("test");
        assertEquals("test", textNode.text());
    }

}