package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedNodeName_MockText {

    @Test
    public void nodeName_MockText() throws IOException {
        String text = "Hello World";
        String expectedName = "text";
        when(nodeName()).thenReturn(expectedName);
        TextNode node = new TextNode(text);
        assertEquals(expectedName, node.nodeName());
    }

}