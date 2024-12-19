package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.junit.jupiter.api.Test;

public class GeneratedTestNoChildNodes {

    @Test
    public void testNoChildNodes() {
        Element element = new Element("p");
        assertFalse(element.hasChildNodes());
    }

}