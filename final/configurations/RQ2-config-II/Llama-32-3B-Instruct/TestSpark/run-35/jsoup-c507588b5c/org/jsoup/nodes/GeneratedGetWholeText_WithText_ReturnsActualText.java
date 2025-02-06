package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.LeafNode;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedGetWholeText_WithText_ReturnsActualText {

    @Test
    public void getWholeText_WithText_ReturnsActualText() {
        String text = "test";
        LeafNode node = new LeafNode(text);
        TextNode textNode = (TextNode) node;
        assertEquals(text, textNode.getWholeText());
    }

}