package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

public class GeneratedTest {

    @Test
    public void constructorTest() {
        Element element = new Element(Tag.valueOf("p"), "http://test.com");
        assertEquals("p", element.tagName());
        assertEquals("http://test.com", element.baseUri());
    }

    @Test
    public void hasChildNodesTest() {
        Element element = new Element(Tag.valueOf("p"), "http://test.com");
        assertFalse(element.hasChildNodes());
    }

    @Test
    public void baseUriTest() {
        Element element = new Element(Tag.valueOf("p"), "http://test.com");
        assertEquals("http://test.com", element.baseUri());
    }

    @Test
    public void tagNameTest() {
        Element element = new Element(Tag.valueOf("p"), "http://test.com");
        assertEquals("p", element.tagName());
    }

    @Test
    public void idTest() {
        Element element = new Element(Tag.valueOf("p"), "http://test.com");
        element.attr("id", "testId");
        assertEquals("testId", element.id());
    }

    @Test
    public void attrTest() {
        Element element = new Element(Tag.valueOf("p"), "http://test.com");
        element.attr("class", "testClass");
        assertEquals("testClass", element.attr("class"));
    }

    @Test
    public void datasetTest() {
        Element element = new Element(Tag.valueOf("p"), "http://test.com");
        element.attr("data-test", "testData");
        assertEquals("testData", element.dataset().get("test"));
    }

    @Test
    public void parentTest() {
        Element element = new Element(Tag.valueOf("div"), "http://test.com");
        Element child = new Element(Tag.valueOf("p"), "http://test.com");
        element.appendChild(child);
        assertNotNull(child.parent());
        assertEquals(element, child.parent());
    }

    @Test
    public void prependChildTest() {
        Element element = new Element(Tag.valueOf("div"), "http://test.com");
        Element child = new Element(Tag.valueOf("p"), "http://test.com");
        element.prependChild(child);
        assertNotNull(child.parent());
        assertEquals(element, child.parent());
        assertEquals(child, element.child(0));
    }

    @Test
    public void appendTextTest() {
        Element element = new Element(Tag.valueOf("div"), "http://test.com");
        element.appendText("Hello, World");
        assertEquals("Hello, World", element.text());
    }

    @Test
    public void selectTest() {
        Element element = new Element(Tag.valueOf("div"), "http://test.com");
        Element childOne = new Element(Tag.valueOf("p"), "http://test.com");
        Element childTwo = new Element(Tag.valueOf("p"), "http://test.com");

        element.appendChild(childOne);
        element.appendChild(childTwo);

        Elements elements = element.select("p");
        assertEquals(2, elements.size());
    }

    @Test
    public void classesTest() {
        Element element = new Element(Tag.valueOf("p"), "http://test.com");
        element.addClass("test");
        assertTrue(element.hasClass("test"));
        element.removeClass("test");
        assertFalse(element.hasClass("test"));
    }

    @Test
    public void textTest() {
        Element element = new Element(Tag.valueOf("p"), "http://test.com");
        element.text("Hello, World");
        assertEquals("Hello, World", element.text());
    }

    @Test
    public void htmlTest() {
        Element element = new Element(Tag.valueOf("div"), "http://test.com");
        element.html("<p>Hello, World</p>");
        assertEquals("<p>Hello, World</p>", element.html());
    }

}