package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.LeafNode;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTextAssign_NoText_ReturnsEmptyString {

    @Test
    public void textAssign_NoText_ReturnsEmptyString() {
        LeafNode node = new LeafNode();
        TextNode textNode = (TextNode) node;
        textNode.text("");
        assertEquals("", textNode.text());
    }

}