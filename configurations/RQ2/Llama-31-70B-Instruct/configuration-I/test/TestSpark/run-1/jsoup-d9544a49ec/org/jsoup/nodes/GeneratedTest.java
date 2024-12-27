package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTest {

    @Test
    public void testHasChildNodes() {
        Element element = new Element(Tag.valueOf("div"), "");
        assertFalse(element.hasChildNodes());
    }

    @Test
    public void testEnsureChildNodes() {
        Element element = new Element(Tag.valueOf("div"), "");
        List<Node> childNodes = element.ensureChildNodes();
        assertNotNull(childNodes);
        assertTrue(childNodes.isEmpty());
    }

    @Test
    public void testHasAttributes() {
        Element element = new Element(Tag.valueOf("div"), "");
        assertFalse(element.hasAttributes());
    }

    @Test
    public void testAttributes() {
        Element element = new Element(Tag.valueOf("div"), "");
        Attributes attributes = element.attributes();
        assertNotNull(attributes);
        assertTrue(attributes.isEmpty());
    }

    @Test
    public void testBaseUri() {
        Element element = new Element(Tag.valueOf("div"), "");
        assertEquals("", element.baseUri());
    }

    @Test
    public void testDoSetBaseUri() {
        Element element = new Element(Tag.valueOf("div"), "");
        element.doSetBaseUri("http://example.com");
        assertEquals("http://example.com", element.baseUri());
    }

    @Test
    public void testChildNodeSize() {
        Element element = new Element(Tag.valueOf("div"), "");
        assertEquals(0, element.childNodeSize());
    }

}