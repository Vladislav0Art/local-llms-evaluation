package org.jsoup.nodes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.jsoup.nodes.Element;
import org.junit.jupiter.api.Test;

public class GeneratedTestSelectFirst {

    @Test
    public void testSelectFirst() {
        Element element = new Element("div");
        element.appendElement("p");
        element.appendElement("p");
        element.appendElement("span");

        Element selectedElement = element.selectFirst("div p");

        assertNotNull(selectedElement);
        assertEquals("p", selectedElement.tagName());
    }

}