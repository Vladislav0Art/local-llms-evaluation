package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTest {

    @Test
    public void testHasChildNodes() {
        Element element = new Element(Tag.valueOf("div"), "");
        assertTrue(element.hasChildNodes());
    }

    @Test
    public void testEnsureChildNodes() {
        Element element = new Element(Tag.valueOf("div"), "");
        assertEquals(element.ensureChildNodes().size(), 0);
    }

    @Test
    public void testHasAttributes() {
        Element element = new Element(Tag.valueOf("div"), "");
        assertFalse(element.hasAttributes());
    }

    @Test
    public void testAttributes() {
        Element element = new Element(Tag.valueOf("div"), "");
        assertNotNull(element.attributes());
    }

    @Test
    public void testBaseUri() {
        Element element = new Element(Tag.valueOf("div"), "");
        assertEquals(element.baseUri(), "");
    }

    @Test
    public void testChildNodeSize() {
        Element element = new Element(Tag.valueOf("div"), "");
        assertEquals(element.childNodeSize(), 0);
    }

    @Test
    public void testNodeName() {
        Element element = new Element(Tag.valueOf("div"), "");
        assertEquals(element.nodeName(), "div");
    }

    @Test
    public void testTagName() {
        Element element = new Element(Tag.valueOf("div"), "");
        assertEquals(element.tagName(), "div");
    }

    @Test
    public void testIsBlock() {
        Element element = new Element(Tag.valueOf("div"), "");
        assertTrue(element.isBlock());
    }

    @Test
    public void testId() {
        Element element = new Element(Tag.valueOf("div"), "");
        assertEquals(element.id(), "");
    }

}