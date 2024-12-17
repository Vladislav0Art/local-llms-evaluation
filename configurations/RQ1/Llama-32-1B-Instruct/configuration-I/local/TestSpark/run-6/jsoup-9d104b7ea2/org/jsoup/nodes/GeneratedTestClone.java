package org.jsoup.nodes;

import java.io.IOException;
import java.text.Normalizer;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.mockito.Mock;
import org.mockito.Mockito;

public class GeneratedTestClone {

    @Mock
    private Node parentNode;

    @Mock
    private Document document;

    @Test
    public void testClone() {
        TextNode node = Mockito.mock(TextNode.class);
        whenNode.getText().toString().equals("");

        TextNode clone1 = (TextNode) TestUtils.clone(node).clone();
        Node previousSibling = parentNode.getPreviousSibling();
        Node sibling2 = clone1.getSibling();

        assertTrue(sibling1.equals(previousSibling));
    }

}