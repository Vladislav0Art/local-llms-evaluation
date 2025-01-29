package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;

public class GeneratedText_Test {

    @Test
    public void text_Test() {
        Node node = Mockito.mock(TextNode.class);
        String text = "Hello, World!";
        Mockito.when(node.text()).thenReturn(text);
        assertEquals(text, getNodeText(node));
    }

}