package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.LeafNode;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedSplitText_NoOffset_ReturnsNull {

    @Test
    public void splitText_NoOffset_ReturnsNull() {
        LeafNode node = new LeafNode();
        TextNode textNode = (TextNode) node;
        assertNull(textNode.splitText(0));
    }

}