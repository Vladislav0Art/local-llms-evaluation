package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.LeafNode;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedNodeName_WithText_ReturnsTextAsTagName {

    @Test
    public void nodeName_WithText_ReturnsTextAsTagName() {
        String text = "test";
        LeafNode node = new LeafNode(text);
        TextNode textNode = (TextNode) node;
        assertEquals(text, textNode.nodeName());
    }

}