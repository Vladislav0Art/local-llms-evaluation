package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.mockito.Mockito;

public class GeneratedToString_Test {

    @Test
    public void toString_Test() {
        Node node = Mockito.mock(TextNode.class);
        assertEquals("<text> Hello, World!</text>", getNodeToString(node));
    }

}