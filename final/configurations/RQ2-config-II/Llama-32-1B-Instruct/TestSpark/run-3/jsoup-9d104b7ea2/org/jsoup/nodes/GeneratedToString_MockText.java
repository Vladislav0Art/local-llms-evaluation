package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedToString_MockText {

    @Test
    public void toString_MockText() throws IOException {
        String text = "Hello World";
        String expectedValue = "text(text(\"Hello World\"))";
        when(toString()).thenReturn(expectedValue);
        TextNode node = new TextNode(text);
        assertEquals(expectedValue, node.toString());
    }

}