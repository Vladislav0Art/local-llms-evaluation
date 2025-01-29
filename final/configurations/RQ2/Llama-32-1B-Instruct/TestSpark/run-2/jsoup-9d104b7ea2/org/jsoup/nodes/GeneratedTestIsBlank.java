package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;

public class GeneratedTestIsBlank {

    @Test
    public void testIsBlank() {
        Node node1 = new Document().text("");
        assertEquals(true, node1.isBlank());
    }

}