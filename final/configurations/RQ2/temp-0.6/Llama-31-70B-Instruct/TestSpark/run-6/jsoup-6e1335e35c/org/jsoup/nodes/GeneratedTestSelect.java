package org.jsoup.nodes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.jsoup.nodes.Element;
import org.junit.jupiter.api.Test;

public class GeneratedTestSelect {

    @Test
    public void testSelect() {
        Element element = new Element("div");
        element.appendElement("p");
        element.appendElement("p");
        element.appendElement("span");

        Elements elements = element.select("div p");

        assertNotNull(elements);
        assertEquals(2, elements.size());
    }

}