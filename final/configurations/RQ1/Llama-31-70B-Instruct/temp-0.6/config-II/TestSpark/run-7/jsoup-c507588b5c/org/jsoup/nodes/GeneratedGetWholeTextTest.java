package org.jsoup.nodes;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedGetWholeTextTest {

    @Mock
    private TextNode textNode;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void getWholeTextTest() {
        when(textNode.getWholeText()).thenReturn("test");
        assertEquals("test", textNode.getWholeText());
    }

}