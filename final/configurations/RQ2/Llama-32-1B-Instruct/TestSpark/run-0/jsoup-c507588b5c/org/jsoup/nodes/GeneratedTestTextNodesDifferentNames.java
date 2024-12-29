package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.mockito.Mockito;

public class GeneratedTestTextNodesDifferentNames {

    @Test
    public void testTextNodesDifferentNames() {
        Node node1 = Mockito.mock(Node.class);
        Node node2 = Mockito.mock(TextNode.class);

        when(node1.getNodeName()).thenReturn("text");
        when(node2.getNodeName()).thenReturn("");

        assertEquals(null, node1);
        assertEquals(expected1, node2);
    }

}