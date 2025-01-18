package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedTest {

    @Test
    public void hasChildNodesWhenEmptyTest() {
        Element element = new Element("div");
        assertFalse(element.hasChildNodes());
    }

    @Test
    public void hasChildNodesWhenNotEmptyTest() {
        Element element = new Element("div");
        Element child = new Element("p");
        element.appendChild(child);
        assertTrue(element.hasChildNodes());
    }

    @Test
    public void hasAttributesWhenEmptyTest() {
        Element element = new Element("div");
        assertFalse(element.hasAttributes());
    }

    @Test
    public void hasAttributesWhenNotEmptyTest() {
        Element element = new Element("div");
        element.attr("class", "test");
        assertTrue(element.hasAttributes());
    }

    @Test
    public void childNodeSizeWhenEmptyTest() {
        Element element = new Element("div");
        assertEquals(0, element.childNodeSize());
    }

    @Test
    public void childNodeSizeWhenNotEmptyTest() {
        Element element = new Element("div");
        Element child = new Element("p");
        element.appendChild(child);
        assertEquals(1, element.childNodeSize());
    }

    @Test
    public void baseUriTest() {
        Element element = new Element("div");
        assertEquals("", element.baseUri());
    }

    @Test
    public void doSetBaseUriTest() {
        Element element = new Element("div");
        element.doSetBaseUri("http://example.com");
        assertEquals("http://example.com", element.baseUri());
    }

    @Test
    public void nodeNameTest() {
        Element element = new Element("div");
        assertEquals("div", element.nodeName());
    }

    @Test
    public void normalNameTest() {
        Element element = new Element("DIV");
        assertEquals("div", element.normalName());
    }

    @Test
    public void appendChildTest() {
        Element element = new Element("div");
        Element child = new Element("p");
        element.appendChild(child);
        assertEquals(child, element.child(0));
    }

    @Test
    public void idTest() {
        Element element = new Element("div");
        element.id("test");
        assertEquals("test", element.id());
    }

    @Test
    public void appendEmptyTest() {
        Element element = new Element("div");
        element.append("");
        assertEquals("", element.html());
    }

    @Test
    public void appendNotEmptyTest() {
        Element element = new Element("div");
        element.append("<p>Test</p>");
        assertEquals("<p>Test</p>", element.html());
    }

    @Test
    public void afterEmptyTest() {
        Element element = new Element("div");
        element.after("");
        assertNull(element.nextSibling());
    }

    @Test
    public void afterNotEmptyTest() {
        Element element = new Element("div");
        element.after("<p>Test</p>");
        assertNotNull(element.nextSibling());
    }

    @Test
    public void dataTest() {
        Element element = new Element("div");
        String data = "Test data";
        element.text(data);
        assertEquals(data, element.data());
    }

}