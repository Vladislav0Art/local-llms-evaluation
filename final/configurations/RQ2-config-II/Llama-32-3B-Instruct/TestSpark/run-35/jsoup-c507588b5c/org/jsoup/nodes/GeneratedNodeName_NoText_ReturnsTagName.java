package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.LeafNode;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedNodeName_NoText_ReturnsTagName {

    @Test
    public void nodeName_NoText_ReturnsTagName() {
        LeafNode node = new LeafNode("div");
        TextNode textNode = (TextNode) node;
        assertEquals("div", textNode.nodeName());
    }

}