package org.jsoup.nodes;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;

public class GeneratedTestIsBlankNullText {

    private TextNode textNode;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        textNode = new TextNode("test");
    }

    @Test
    public void testIsBlankNullText() {
        textNode.text(null);
        boolean expected = true;

        boolean actual = textNode.isBlank();

        assertEquals(expected, actual);
    }

}