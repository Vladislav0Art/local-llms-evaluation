package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedIsBlank_MockText {

    @Test
    public void isBlank_MockText() throws IOException {
        String text = "";
        String expectedValue = false;
        when(isBlank()).thenReturn(expectedValue);
        TextNode node = new TextNode(text);
        assertEquals(false, node.isBlank());
    }

}