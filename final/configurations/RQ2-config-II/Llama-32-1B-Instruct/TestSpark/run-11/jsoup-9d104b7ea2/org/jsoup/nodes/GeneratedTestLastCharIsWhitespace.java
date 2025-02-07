package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.mockito.Mockito;

public class GeneratedTestLastCharIsWhitespace {

    @Test
    public void testLastCharIsWhitespace() {
        String text = "   Hello World  ";
        StringBuilder sb = new StringBuilder(text);
        TextNode node = Mockito.mock(TextNode.class);
        when(node.lastCharIsWhitespace(sb)).thenReturn(true); // Test that lastCharIsWhitespace() returns the expected value
        assertEquals(true, sb.lastChars().iterator().next().equals(' '));
        Mockito.verify(node).lastCharIsWhitespace(sb);
    }

}