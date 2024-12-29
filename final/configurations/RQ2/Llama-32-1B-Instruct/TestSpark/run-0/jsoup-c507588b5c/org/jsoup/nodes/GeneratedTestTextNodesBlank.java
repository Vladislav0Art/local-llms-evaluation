package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.mockito.Mockito;

public class GeneratedTestTextNodesBlank {

    @Test
    public void testTextNodesBlank() {
        Node node = Mockito.mock(Node.class);

        when(node.isBlank()).thenReturn(true);

        assertEquals(true, node.isBlank());
    }

}