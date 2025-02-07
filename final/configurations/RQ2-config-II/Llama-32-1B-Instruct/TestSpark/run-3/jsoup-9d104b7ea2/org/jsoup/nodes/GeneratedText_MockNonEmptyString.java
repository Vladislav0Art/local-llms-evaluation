package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedText_MockNonEmptyString {

    @Test
    public void text_MockNonEmptyString() throws IOException {
        String text = "";
        String expectedValue = "";
        when(text()).thenReturn(expectedValue);
        TextNode node = new TextNode(text);
        assertEquals(expectedValue, node.text());
    }

}