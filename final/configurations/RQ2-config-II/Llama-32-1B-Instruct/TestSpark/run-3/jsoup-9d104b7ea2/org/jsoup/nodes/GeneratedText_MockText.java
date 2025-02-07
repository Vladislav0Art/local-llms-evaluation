package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedText_MockText {

    @Test
    public void text_MockText() throws IOException {
        String text = "Hello World";
        String expectedValue = "Hello World";
        when(text()).thenReturn(expectedValue);
        TextNode node = new TextNode(text);
        assertEquals(expectedValue, node.text());
    }

}