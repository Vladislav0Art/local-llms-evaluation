package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.io.IOException;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class GeneratedNodeNameTextNodeTest {

    @Mock
    private TextNode textNode;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void nodeNameTextNodeTest() {
        when(textNode.nodeName()).thenReturn("#text");
        assertEquals("#text", textNode.nodeName());
    }

}