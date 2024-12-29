package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.mockito.Mockito;

public class GeneratedTestTextNodesNonBlank {

    @Test
    public void testTextNodesNonBlank() {
        Node node = Mockito.mock(Node.class);

        when(node.isBlank()).thenReturn(false);

        assertEquals(false, node.isBlank());
    }

}