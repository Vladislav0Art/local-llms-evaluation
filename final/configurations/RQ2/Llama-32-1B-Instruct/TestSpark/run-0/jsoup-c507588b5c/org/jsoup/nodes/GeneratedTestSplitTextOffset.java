package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.mockito.Mockito;

public class GeneratedTestSplitTextOffset {

    @Test
    public void testSplitTextOffset() {
        Node node1 = Mockito.mock(TextNode.class);
        Node expected1 = Mockito.mock(TextNode.class);

        when(node1.splitText(0)).thenReturn(expected1);

        assertEquals(expected1, node1.splitText(0));
    }

}