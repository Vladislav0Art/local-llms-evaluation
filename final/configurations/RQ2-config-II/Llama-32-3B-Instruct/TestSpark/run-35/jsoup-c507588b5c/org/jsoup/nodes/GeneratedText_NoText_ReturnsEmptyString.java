package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.LeafNode;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedText_NoText_ReturnsEmptyString {

    @Test
    public void text_NoText_ReturnsEmptyString() {
        LeafNode node = new LeafNode();
        TextNode textNode = (TextNode) node;
        assertEquals("", textNode.text());
    }

}