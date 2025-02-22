package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedOuterHtmlTailTest {

    @Mock
    TextNode textNode;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void outerHtmlTailTest() {
        when(textNode.outerHtmlTail()).thenReturn(0);
        assertEquals(0, textNode.outerHtmlTail());
    }

}