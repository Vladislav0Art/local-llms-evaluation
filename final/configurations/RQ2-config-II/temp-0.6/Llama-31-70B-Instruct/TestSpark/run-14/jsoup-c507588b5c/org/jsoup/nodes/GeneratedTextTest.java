package org.jsoup.nodes;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedTextTest {

    @Test
    public void textTest() {
        TextNode textNode = new TextNode("  foo  ");
        assertEquals("foo", textNode.text());
    }

}