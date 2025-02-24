package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.parser.ParseSettings;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Test
    public void testHasChildNodes() {
        Element element = new Element("div");
        assertFalse(element.hasChildNodes());
        element.appendChild(new Element("p"));
        assertTrue(element.hasChildNodes());
    }

    @Test
    public void testHasAttributes() {
        Element element = new Element("div");
        assertFalse(element.hasAttributes());
        element.attr("id", "test");
        assertTrue(element.hasAttributes());
    }

    @Test
    public void testBaseUri() {
        Element element = new Element("div");
        assertNull(element.baseUri());
        element.setBaseUri("https://example.com");
        assertEquals("https://example.com", element.baseUri());
    }

    @Test
    public void testNodeName() {
        Element element = new Element("div");
        assertEquals("div", element.nodeName());
    }

    @Test
    public void testTagName() {
        Element element = new Element("div");
        assertEquals("div", element.tagName());
    }

    @Test
    public void testIsBlock() {
        Element element = new Element("div");
        assertTrue(element.isBlock());
        element.tagName("span");
        assertFalse(element.isBlock());
    }

}