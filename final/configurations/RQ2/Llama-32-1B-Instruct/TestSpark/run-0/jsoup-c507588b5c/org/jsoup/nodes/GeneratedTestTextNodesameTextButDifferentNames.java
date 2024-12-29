package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.mockito.Mockito;

public class GeneratedTestTextNodesameTextButDifferentNames {

    @Test
    public void testTextNodesameTextButDifferentNames() {
        Node node1 = Mockito.mock(Node.class);
        Node expected1 = Mockito.mock(TextNode.class);

        when(node1.getText()).thenReturn("");
        when(expected1.getText()).thenReturn("");

        assertEquals(expected1, node1);
    }

}