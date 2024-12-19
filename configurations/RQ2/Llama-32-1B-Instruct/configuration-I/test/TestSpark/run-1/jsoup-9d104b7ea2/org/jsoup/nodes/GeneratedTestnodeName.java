package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTestnodeName {

    @Test
    public void testnodeName() {
        String text = "Hello World";
        when(getNodeName(text)).thenReturn("TextNode");
        assertEquals("TextNode", getNodeName(text));
    }

}