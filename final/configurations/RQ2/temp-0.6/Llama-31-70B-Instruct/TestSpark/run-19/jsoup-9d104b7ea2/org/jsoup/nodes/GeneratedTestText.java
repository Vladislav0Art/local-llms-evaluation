package org.jsoup.nodes;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;

public class GeneratedTestText {

    private TextNode textNode;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        textNode = new TextNode("test");
    }

    @Test
    public void testText() {
        String expected = "test";

        String actual = textNode.text();

        assertEquals(expected, actual);
    }

}