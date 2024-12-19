package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.junit.jupiter.api.Test;

public class GeneratedTestNoAttributes {

    @Test
    public void testNoAttributes() {
        Element element = new Element("span");
        assertFalse(element.hasAttributes());
    }

}