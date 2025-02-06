package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.LeafNode;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedSplitText_WithOffset_ReturnsActualText {

    @Test
    public void splitText_WithOffset_ReturnsActualText() {
        String text = "test";
        LeafNode node = new LeafNode(text);
        TextNode textNode = (TextNode) node;
        assertEquals("te", textNode.splitText(1).text());
    }

}