package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.mockito.Mockito;

public class GeneratedTestTextNodesameName {

    @Test
    public void testTextNodesameName() {
        Node node = Mockito.mock(Node.class);
        Node expected = Mockito.mock(TextNode.class);

        when(node.getNodeName()).thenReturn("text");
        when(expected.getNodeName()).thenReturn("text");

        assertEquals(expected, node);
    }

}