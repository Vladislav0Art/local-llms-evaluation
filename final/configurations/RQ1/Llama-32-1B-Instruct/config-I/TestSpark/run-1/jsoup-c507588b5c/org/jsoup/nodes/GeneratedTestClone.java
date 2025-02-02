package org.jsoup.nodes;

import org.jsoup.nodes.Document;

import static org.mockito.Mockito.*;

public class GeneratedTestClone {

    @Test
    public void testClone() {
        TextNode node = new TextNode("   \n  Hello\n");
        when(nodeGetWholeText()).thenReturn("Hello World");
        TextNode clone = (TextNode) node.clone();
        assertEquals("Hello World", clone.text());
        verify(node).text(anyString());
    }

}