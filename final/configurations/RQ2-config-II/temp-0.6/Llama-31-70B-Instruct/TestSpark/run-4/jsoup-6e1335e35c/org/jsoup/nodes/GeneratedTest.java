package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Tag;
import org.jsoup.parser.ParseSettings;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTest {

    @Test
    public void testHasChildNodes() {
        Element element = new Element(Tag.valueOf("div"), "http://example.com/", new Attributes());
        assertFalse(element.hasChildNodes());
    }

    @Test
    public void testEnsureChildNodes() {
        Element element = new Element(Tag.valueOf("div"), "http://example.com/", new Attributes());
        assertNotNull(element.ensureChildNodes());
    }

    @Test
    public void testHasAttributes() {
        Element element = new Element(Tag.valueOf("div"), "http://example.com/", new Attributes());
        assertTrue(element.hasAttributes());
    }

    @Test
    public void testAttributes() {
        Element element = new Element(Tag.valueOf("div"), "http://example.com/", new Attributes());
        assertNotNull(element.attributes());
    }

    @Test
    public void testBaseUri() {
        Element element = new Element(Tag.valueOf("div"), "http://example.com/", new Attributes());
        assertEquals("http://example.com/", element.baseUri());
    }

    @Test
    public void testDoSetBaseUri() {
        Element element = new Element(Tag.valueOf("div"), "http://example.com/", new Attributes());
        element.doSetBaseUri("http://example.com/");
        assertEquals("http://example.com/", element.baseUri());
    }

}