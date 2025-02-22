package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedOuterHtmlHeadTest {

    @Mock
    private TextNode textNode;

    @Test
    public void outerHtmlHeadTest() {
        when(textNode.outerHtmlHead(any(), anyInt(), any())).thenThrow(new RuntimeException());
        try {
            textNode.outerHtmlHead(null, 1, null);
            fail("Exception expected");
        } catch (Exception e) {
            assertEquals("Exception expected", e.getMessage());
        }
    }

}