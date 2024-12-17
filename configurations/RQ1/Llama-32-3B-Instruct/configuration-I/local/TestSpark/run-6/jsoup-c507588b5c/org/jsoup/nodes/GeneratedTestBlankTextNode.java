package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

public class GeneratedTestBlankTextNode {

    @Test
    public void testBlankTextNode() {
        Document document = new Document();
        Elements nodes = document.body().children();

        assertNotNull(nodes);
        assertEquals(1, nodes.size());

        Element textNode = (Element) nodes.get(0);

        assertTrue(textNode.isBlank());
        assertFalse(textNode.isBlank());
    }

}