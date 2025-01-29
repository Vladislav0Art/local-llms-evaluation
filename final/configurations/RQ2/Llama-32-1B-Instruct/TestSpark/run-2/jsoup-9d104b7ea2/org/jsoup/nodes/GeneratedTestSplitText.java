package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;

public class GeneratedTestSplitText {

    @Test
    public void testSplitText() {
        String text = "Hello World";
        TextNode node = new Document().text(text);
        int offset = 3;
        TextNode node2 = node.splitText(offset);
        assertNotNull(node2);
        assertEquals(text.substring(0, offset), node2.text());
    }

}