package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.TextNode;
import org.mockito.Mockito;

public class GeneratedSplitTextTest {

    @Test
    public void splitTextTest() {
        String text = "Hello World";
        TextNode node = new TextNode(text);
        assertEquals(4, node.splitText(0));
        Mockito.when(node.toString()).thenReturn("Hello World");
    }

}