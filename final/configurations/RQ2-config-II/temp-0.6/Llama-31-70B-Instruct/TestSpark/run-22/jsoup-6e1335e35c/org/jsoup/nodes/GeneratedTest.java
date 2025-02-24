package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.Tag;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedTest {

    @Test
    public void testConstructorWithTag() {
        Element element = new Element(Tag.valueOf("div"));
        assertEquals("div", element.tagName());
        assertEquals("", element.baseUri());
    }

    @Test
    public void testConstructorWithTagAndBaseUri() {
        Element element = new Element(Tag.valueOf("a"), "http://example.com");
        assertEquals("a", element.tagName());
        assertEquals("http://example.com", element.baseUri());
    }

    @Test
    public void testHasChildNodes() {
        Element element = new Element(Tag.valueOf("div"));
        assertFalse(element.hasChildNodes());
        element.appendChild(new Element(Tag.valueOf("span")));
        assertTrue(element.hasChildNodes());
    }

    @Test
    public void testEnsureChildNodes() {
        Element element = new Element(Tag.valueOf("div"));
        assertEquals(0, element.childNodeSize());
        element.ensureChildNodes().add(new Node(null));
        assertEquals(1, element.childNodeSize());
    }

    @Test
    public void testHasAttributes() {
        Element element = new Element(Tag.valueOf("div"));
        assertFalse(element.hasAttributes());
        element.attr("color", "red");
        assertTrue(element.hasAttributes());
    }

}