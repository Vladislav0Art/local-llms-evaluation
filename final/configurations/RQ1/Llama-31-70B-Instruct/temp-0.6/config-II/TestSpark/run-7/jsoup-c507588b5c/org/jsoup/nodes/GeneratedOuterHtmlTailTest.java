package org.jsoup.nodes;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedOuterHtmlTailTest {

    @Mock
    private TextNode textNode;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void outerHtmlTailTest() {
        try {
            textNode.outerHtmlTail(null, 0, null);
        } catch (IOException e) {
            fail("outerHtmlTailTest failed.");
        }
    }

}