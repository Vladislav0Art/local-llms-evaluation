package org.jsoup.nodes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.jsoup.nodes.Element;
import org.junit.jupiter.api.Test;

public class GeneratedTestGetElementsByAttributeValue {

    @Test
    public void testGetElementsByAttributeValue() {
        Element element = new Element("div");
        element.attr("id", "1");
        element.attr("id", "2");
        element.attr("id", "3");

        Elements elements = element.getElementsByAttributeValue("id", "1");

        assertNotNull(elements);
        assertEquals(1, elements.size());
    }

}