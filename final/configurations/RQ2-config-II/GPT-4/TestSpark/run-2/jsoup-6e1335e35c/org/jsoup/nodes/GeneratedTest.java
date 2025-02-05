package org.jsoup.nodes;

import static org.junit.Assert.*;

import org.jsoup.nodes.*;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void tagNameTest() {
        Element element = new Element("div");
        assertEquals("div", element.tagName());
    }

    @Test
    public void attrTest() {
        Element element = new Element("div");
        element.attr("id", "mydiv");
        assertEquals("mydiv", element.attr("id"));
    }

    @Test
    public void textTest() {
        Element element = new Element("div");
        element.text("Hello World");
        assertEquals("Hello World", element.text());
    }

    @Test
    public void childNodeSizeTest() {
        Element element = new Element("div");
        element.appendChild(new Element("p"));
        assertEquals(1, element.childNodeSize());
    }

    @Test
    public void hasClassTest() {
        Element element = new Element("div");
        element.addClass("example");
        assertTrue(element.hasClass("example"));
    }

    @Test
    public void hasAttributesTest() {
        Element element = new Element("div");
        element.attr("class", "myClass");
        assertTrue(element.hasAttributes());
    }

    @Test
    public void appendChildTest() {
        Element parent = new Element("div");
        Element child = new Element("span");
        parent.appendChild(child);
        assertEquals(child, parent.child(0));
    }

    @Test
    public void removeClassTest() {
        Element element = new Element("div");
        element.addClass("myClass");
        element.removeClass("myClass");
        assertFalse(element.hasClass("myClass"));
    }

    @Test
    public void datasetTest() {
        Element element = new Element("div");
        element.attr("data-test", "value");
        assertTrue(element.dataset().containsKey("test"));
        assertEquals("value", element.dataset().get("test"));
    }

}