package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedGetWholeText_MockText {

    @Test
    public void getWholeText_MockText() throws IOException {
        String text = "Hello World";
        String expectedValue = "Hello World";
        when(getWholeText()).thenReturn(expectedValue);
        TextNode node = new TextNode(text);
        assertEquals(expectedValue, node.getWholeText());
    }

}