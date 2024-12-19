package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.junit.jupiter.api.Test;

public class GeneratedTestHasAttributes {

    @Test
    public void testHasAttributes() {
        Element element = new Element("input");
        element.addAttribute("type", "text");
        assertTrue(element.hasAttributes());
    }

}