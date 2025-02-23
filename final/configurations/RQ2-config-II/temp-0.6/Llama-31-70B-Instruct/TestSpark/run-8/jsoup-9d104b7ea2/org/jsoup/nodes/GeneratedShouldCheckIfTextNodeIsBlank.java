package org.jsoup.nodes;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

public class GeneratedShouldCheckIfTextNodeIsBlank {

    private TextNode textNode;

    @Before
    public void setUp() {
        textNode = new TextNode("some text");
    }

    @Test
    public void shouldCheckIfTextNodeIsBlank() {
        // when
        boolean isBlank = textNode.isBlank();

        // then
        assertEquals(false, isBlank);
    }

}