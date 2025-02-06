package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.LeafNode;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedIsBlank_WithText_ReturnsFalse {

    @Test
    public void isBlank_WithText_ReturnsFalse() {
        String text = "test";
        LeafNode node = new LeafNode(text);
        TextNode textNode = (TextNode) node;
        assertFalse(textNode.isBlank());
    }

}