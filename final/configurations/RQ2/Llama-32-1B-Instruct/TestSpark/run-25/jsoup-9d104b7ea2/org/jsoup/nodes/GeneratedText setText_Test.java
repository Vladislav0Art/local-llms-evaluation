package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;

public class GeneratedText setText_Test {

    @Test
    public void text

    setText_Test() {
        Node node = Mockito.mock(TextNode.class);
        String text = "Hello, World!";
        TextNode newNode = Mockito.mock(TextNode.class);
        Mockito.when(newNode.text()).thenReturn(text);
        assertTextNode(node, newNode);
    }

}