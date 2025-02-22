package org.jsoup.nodes;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedSplitTextTest {

    @Mock
    private TextNode textNode;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void splitTextTest() {
        when(textNode.splitText(2)).thenReturn(textNode);
        assertEquals(textNode, textNode.splitText(2));
    }

}