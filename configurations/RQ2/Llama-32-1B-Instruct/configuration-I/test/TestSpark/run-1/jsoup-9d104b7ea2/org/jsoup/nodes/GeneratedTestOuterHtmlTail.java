package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTestOuterHtmlTail {

    @Test
    public void testOuterHtmlTail() {
        String text = "Hello World";
        TextNode node = new TextNode(text);
        when(getOuterHtmlTail(text)).thenReturn("World");
    }

}