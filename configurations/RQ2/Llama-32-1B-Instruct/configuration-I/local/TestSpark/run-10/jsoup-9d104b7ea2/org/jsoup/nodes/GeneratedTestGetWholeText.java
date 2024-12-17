package org.jsoup.nodes;

import org.jsoup.nodes.Appendable;
import org.jsoup.nodes.TextNode;
import org.junit.jupiter.api.Test;

public class GeneratedTestGetWholeText {

    @Test
    public void testGetWholeText() {
        TextNode node = new TextNode("<html><body>Hello World!</body></html>");
        assertEquals(node.getText(), "Hello World!");
    }

}