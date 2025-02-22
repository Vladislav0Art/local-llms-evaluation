package org.jsoup.nodes;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedShouldCheckIfNodeIsBlank {

    private TextNode textNode;

    @Before
    public void setUp() {
        textNode = new TextNode("example text");
    }

    @Test
    public void shouldCheckIfNodeIsBlank() {
        boolean isBlank = textNode.isBlank();
        assertEquals(false, isBlank);
    }

}