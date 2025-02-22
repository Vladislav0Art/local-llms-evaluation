package org.jsoup.nodes;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;

public class GeneratedTestTextWithNewLineAndSpaces {

    private TextNode textNode;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        textNode = new TextNode("test");
    }

    @Test
    public void testTextWithNewLineAndSpaces() {
        String expected = "test";

        textNode.text("   test\n\n");
        String actual = textNode.text();

        assertEquals(expected, actual);
    }

}