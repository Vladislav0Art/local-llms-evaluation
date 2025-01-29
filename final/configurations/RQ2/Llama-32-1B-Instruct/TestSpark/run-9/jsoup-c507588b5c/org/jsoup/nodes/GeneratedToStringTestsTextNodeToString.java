package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedToStringTestsTextNodeToString {

    @Test
    public void toStringTestsTextNodeToString() {
        TextNode node = new TextNode();
        when(node.toString()).thenReturn("Hello, World!");
        assertEquals("Hello, World!", node.toString());
    }

}