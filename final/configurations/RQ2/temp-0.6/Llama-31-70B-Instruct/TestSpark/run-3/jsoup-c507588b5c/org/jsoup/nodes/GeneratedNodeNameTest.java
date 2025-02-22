package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedNodeNameTest {

    @Mock
    private TextNode textNode;

    @Test
    public void nodeNameTest() {
        when(textNode.nodeName()).thenReturn("#text");
        assertEquals("#text", textNode.nodeName());
    }

}