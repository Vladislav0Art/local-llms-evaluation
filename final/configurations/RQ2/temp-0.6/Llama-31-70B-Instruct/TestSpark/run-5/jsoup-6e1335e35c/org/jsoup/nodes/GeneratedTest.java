package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTest {

    private Element element;

    @BeforeEach
    public void setUp() {
        element = new Element("div");
    }

    @Test
    public void testHasChildNodes() {
        assertFalse(element.hasChildNodes());
    }

    @Test
    public void testEnsureChildNodes() {
        assertTrue(element.ensureChildNodes().isEmpty());
    }

    @Test
    public void testHasAttributes() {
        assertFalse(element.hasAttributes());
    }

    @Test
    public void testAttributes() {
        assertNotNull(element.attributes());
    }

    @Test
    public void testBaseUri() {
        assertEquals("", element.baseUri());
    }

    @Test
    public void testDoSetBaseUri() {
        element.doSetBaseUri("http://example.com");
        assertEquals("http://example.com", element.baseUri());
    }

    @Test
    public void testChildNodeSize() {
        assertEquals(0, element.childNodeSize());
    }

    @Test
    public void testNodeName() {
        assertEquals("div", element.nodeName());
    }

    @Test
    public void testTagName() {
        assertEquals("div", element.tagName());
    }

}