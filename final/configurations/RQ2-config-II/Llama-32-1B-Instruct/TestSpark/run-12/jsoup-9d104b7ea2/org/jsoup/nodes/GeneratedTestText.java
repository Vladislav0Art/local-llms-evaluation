package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

import java.util.List;

public class GeneratedTestText {

    private TextNode textNode = new TextNode("Hello World");

    @Test
    public void testText() {
        String result = textNode.text();
        assertEquals("Hello World", result);
    }

}