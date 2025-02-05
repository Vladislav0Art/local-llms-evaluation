package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.jsoup.select.Evaluator;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void tagNameTest() {
        Element element = new Element(Tag.valueOf("div"), "");
        element.tagName("p");
        assertEquals("p", element.tagName());
    }

    @Test
    public void attrTest() {
        Element element = new Element(Tag.valueOf("div"), "");
        element.attr("id", "test");
        assertEquals("test", element.attr("id"));
    }

    @Test
    public void hasChildNodesTest() {
        Element element = new Element(Tag.valueOf("div"), "");
        assertFalse(element.hasChildNodes());

        element.appendChild(new Element(Tag.valueOf("p"), ""));
        assertTrue(element.hasChildNodes());
    }

    @Test
    public void datasetTest() {
        Element element = new Element(Tag.valueOf("div"), "");
        element.attr("data-test", "test");
        assertEquals("test", element.dataset().get("test"));
    }

    @Test
    public void idTest() {
        Element element = new Element(Tag.valueOf("div"), "");
        element.id("test");
        assertEquals("test", element.id());
    }

    @Test
    public void childrenSizeTest() {
        Element element = new Element(Tag.valueOf("div"), "");
        assertEquals(0, element.childrenSize());

        element.appendChild(new Element(Tag.valueOf("p"), ""));
        assertEquals(1, element.childrenSize());
    }

    @Test
    public void selectFirstTest() {
        Element element = new Element(Tag.valueOf("div"), "");
        Element child = new Element(Tag.valueOf("p"), "");
        child.id("test");
        element.appendChild(child);

        Element result = element.selectFirst("#test");
        assertEquals(child, result);
    }

    @Test
    public void baseUriTest() {
        String baseUri = "https://example.com";
        Element element = new Element(Tag.valueOf("div"), baseUri);
        assertEquals(baseUri, element.baseUri());
    }

    @Test
    public void attributesTest() {
        Element element = new Element(Tag.valueOf("div"), "");
        assertEquals(0, element.attributes().size());
    }

    @Test
    public void htmlTest() {
        Element element = new Element(Tag.valueOf("div"), "");
        String html = "<p>Hello, World!</p>";
        element.html(html);
        assertEquals(html, element.html());
    }

    @Test
    public void attrBooleanTest() {
        Element element = new Element(Tag.valueOf("div"), "");
        element.attr("booleanAttr", true);
        assertEquals("true", element.attr("booleanAttr"));
    }

    @Test
    public void hasClassTest() {
        Element element = new Element(Tag.valueOf("div"), "");
        element.addClass("testClass");
        assertTrue(element.hasClass("testClass"));
    }

    @Test
    public void removeAttrTest() {
        Element element = new Element(Tag.valueOf("div"), "");
        element.attr("id", "test");
        element.removeAttr("id");
        assertEquals("", element.id());
    }

    @Test
    public void shallowCloneTest() {
        Element element = new Element(Tag.valueOf("div"), "");
        Element clonedElement = element.shallowClone();
        assertEquals(element, clonedElement);
    }

}