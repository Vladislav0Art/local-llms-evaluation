package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

import java.util.List;

public class GeneratedTestSplitText {

    private TextNode textNode = new TextNode("Hello World");

    @Test
    public void testSplitText() {
        String result = textNode.splitText(0);
        assertEquals("Hello World", result);
        when(mockitoMockery.anyInt()).thenReturn(0);
    }

}