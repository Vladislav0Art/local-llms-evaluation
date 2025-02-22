package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedToStringTest {

    @Mock
    TextNode textNode;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void toStringTest() {
        when(textNode.toString()).thenReturn("some text");
        assertEquals("some text", textNode.toString());
    }

}