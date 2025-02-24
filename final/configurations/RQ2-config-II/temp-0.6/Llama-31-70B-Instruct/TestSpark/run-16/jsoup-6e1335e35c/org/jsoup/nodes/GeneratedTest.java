package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.parser.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTest {

    @Test
    public void testHasChildNodes() {
        Element element = new Element(Tag.valueOf("div"), "baseUri");
        assertFalse(element.hasChildNodes());
    }

    @Test
    public void testEnsureChildNodes() {
        Element element = new Element(Tag.valueOf("div"), "baseUri");
        assertNotNull(element.ensureChildNodes());
    }

    @Test
    public void testHasAttributes() {
        Element element = new Element(Tag.valueOf("div"), "baseUri");
        assertTrue(element.hasAttributes());
    }

    @Test
    public void testAttributes() {
        Element element = new Element(Tag.valueOf("div"), "baseUri");
        assertNotNull(element.attributes());
    }

    @Test
    public void testBaseUri() {
        Element element = new Element(Tag.valueOf("div"), "baseUri");
        assertEquals("baseUri", element.baseUri());
    }

    @Test
    public void testDoSetBaseUri() {
        Element element = new Element(Tag.valueOf("div"), "baseUri");
        element.doSetBaseUri("newBaseUri");
        assertEquals("newBaseUri", element.baseUri());
    }

    @Test
    public void testChildNodeSize() {
        Element element = new Element(Tag.valueOf("div"), "baseUri");
        assertEquals(0, element.childNodeSize());
    }

}