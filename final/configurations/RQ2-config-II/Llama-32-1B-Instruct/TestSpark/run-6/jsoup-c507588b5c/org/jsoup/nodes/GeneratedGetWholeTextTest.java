package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.TextNode;
import org.mockito.Mockito;

public class GeneratedGetWholeTextTest {

    @Test
    public void getWholeTextTest() {
        String text = "Hello World";
        TextNode node = new TextNode(text);
        assertEquals("Hello World", node.getWholeText());
        Mockito.when(node.toString()).thenReturn(text);
    }

}