package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.mockito.Mockito;

public class GeneratedClone_Test {

    @Test
    public void clone_Test() {
        Node node = Mockito.mock(TextNode.class);

        Node cloned = clone(node);
        assertNodeIsEqual(node, cloned);
    }

}