package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.LeafNode;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedClone_NoChange_ReturnsSameObject {

    @Test
    public void clone_NoChange_ReturnsSameObject() {
        LeafNode node = new LeafNode();
        TextNode textNode = (TextNode) node;
        assertSame(textNode, textNode.clone());
    }

}