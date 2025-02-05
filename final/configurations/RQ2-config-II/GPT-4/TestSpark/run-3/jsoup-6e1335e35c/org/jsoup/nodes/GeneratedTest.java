package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.jsoup.parser.Tag;
import org.jsoup.select.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void tagNameTest() {
        Element element = new Element("tag");
        assertEquals("tag", element.tagName());
    }

    @Test
    public void tagNameWithArgumentsTest() {
        Element element = new Element("tag", "https://www.example.org");
        assertEquals("tag", element.tagName());
    }

    @Test
    public void attrTest() {
        Element element = new Element("tag");
        element.attr("attributeKey", "attributeValue");
        assertEquals("attributeValue", element.attr("attributeKey"));
    }

    @Test
    public void attrBooleanTest() {
        Element element = new Element("tag");
        element.attr("attributeKey", true);
        assertEquals("true", element.attr("attributeKey"));
    }

    @Test
    public void hasChildNodesTest() {
        Element element = new Element("tag");
        assertFalse(element.hasChildNodes());
    }

    @Test
    public void hasAttributesTest() {
        Element element = new Element("tag");
        assertFalse(element.hasAttributes());
    }

    @Test
    public void baseUriTest() {
        Element element = new Element("tag", "https://www.example.org");
        assertEquals("https://www.example.org", element.baseUri());
    }

    @Test
    public void childNodeSizeTest() {
        Element element = new Element("tag");
        assertEquals(0, element.childNodeSize());
    }

    @Test
    public void selectTest() {
        Element element = new Element("div");
        element.attr("id", "test");
        Elements select = element.select("#test");
        assertEquals(1, select.size());
    }

    @Test
    public void isTest() {
        Element element = new Element("div");
        element.attr("class", "test");
        assertTrue(element.is(".test"));
    }

    @Test
    public void textTest() {
        Element element = new Element("div");
        element.text("inner text");
        assertEquals("inner text", element.text());
    }

    @Test
    public void wrapTest() {
        Element element = new Element("div");
        element.wrap("<span></spam>");  // invalid HTML
    }

    @Test
    public void cloneTest() {
        Element element = new Element("div");
        Element clone = element.clone();
        assertNotSame(element, clone);
    }

    @Test
    public void rootTest() {
        Element element = new Element("div");
        assertEquals(element, element.root());
    }

}