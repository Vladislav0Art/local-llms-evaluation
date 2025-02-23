package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestNodeName {

    @Mock
    private TextNode textNode;

    @Test
    public void testNodeName() {
        when(textNode.nodeName()).thenReturn("#text");

        String actual = textNode.nodeName();

        assertEquals("#text", actual);
    }

}