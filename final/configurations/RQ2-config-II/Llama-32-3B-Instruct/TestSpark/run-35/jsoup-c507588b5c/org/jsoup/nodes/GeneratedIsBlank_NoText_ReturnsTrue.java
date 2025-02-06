package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.LeafNode;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedIsBlank_NoText_ReturnsTrue {

    @Test
    public void isBlank_NoText_ReturnsTrue() {
        LeafNode node = new LeafNode();
        TextNode textNode = (TextNode) node;
        assertTrue(textNode.isBlank());
    }

}