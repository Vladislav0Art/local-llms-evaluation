package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSplitTextTest {

    @Mock
    private TextNode textNode;

    @Test
    public void splitTextTest() {
        when(textNode.splitText(2)).thenReturn(textNode);
        assertEquals(textNode, textNode.splitText(2));
    }

}