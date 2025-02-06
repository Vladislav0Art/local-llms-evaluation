package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.LeafNode;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTextAssign_WithText_ReturnsActualText {

    @Test
    public void textAssign_WithText_ReturnsActualText() {
        String text = "test";
        LeafNode node = new LeafNode(text);
        TextNode textNode = (TextNode) node;
        textNode.text("new text");
        assertEquals("new text", textNode.text());
    }

}