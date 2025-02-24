package org.jsoup.nodes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.jsoup.nodes.Element;
import org.junit.jupiter.api.Test;

public class GeneratedTest {

    @Test
    public void testGetElementsByTag() {
        Element element = new Element("div");
        element.appendElement("p");
        element.appendElement("p");
        element.appendElement("span");

        Elements elements = element.getElementsByTag("p");

        assertNotNull(elements);
        assertEquals(2, elements.size());
    }

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