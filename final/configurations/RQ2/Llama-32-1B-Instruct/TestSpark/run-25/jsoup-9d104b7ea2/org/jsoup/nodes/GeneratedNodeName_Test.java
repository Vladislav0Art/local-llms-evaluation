package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;

public class GeneratedNodeName_Test {

    @Test
    public void nodeName_Test() {
        Node node = Mockito.mock(TextNode.class);
        String expected = "text";
        Mockito.when(node.nodeName()).thenReturn(expected);
        assertNodeName(node, expected);
    }

}