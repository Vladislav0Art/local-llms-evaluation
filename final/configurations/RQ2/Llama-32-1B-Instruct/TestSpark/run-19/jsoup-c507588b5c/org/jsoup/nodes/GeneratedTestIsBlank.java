package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.jupiter.api.Test;

public class GeneratedTestIsBlank {

    @Test
    public void testIsBlank() {
        String text = "";
        TextNode node = new TextNode(text);
        assertTrue(node.isBlank());
    }

}