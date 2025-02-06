package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.LeafNode;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedGetWholeText_NoText_ReturnsEmptyString {

    @Test
    public void getWholeText_NoText_ReturnsEmptyString() {
        LeafNode node = new LeafNode();
        TextNode textNode = (TextNode) node;
        assertEquals("", textNode.getWholeText());
    }

}