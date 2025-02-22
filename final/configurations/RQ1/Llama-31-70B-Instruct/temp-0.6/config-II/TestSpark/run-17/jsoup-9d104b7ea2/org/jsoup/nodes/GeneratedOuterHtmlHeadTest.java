package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedOuterHtmlHeadTest {

    @Mock
    TextNode textNode;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void outerHtmlHeadTest() {
        when(textNode.outerHtmlHead()).thenReturn(0);
        assertEquals(0, textNode.outerHtmlHead());
    }

}