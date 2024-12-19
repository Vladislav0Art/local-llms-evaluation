package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.junit.jupiter.api.Test;

public class GeneratedTestHasChildNodes {

    @Test
    public void testHasChildNodes() {
        Element element = new Element("div");
        element.addAttribute("id", "test");
        assertTrue(element.hasChildNodes());
    }

}