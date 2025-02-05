package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;

import java.util.Collections;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void tagNameValidInputTest() {
        Element element = new Element(Tag.valueOf("div"), "");
        assertEquals("div", element.tagName());

        element.tagName("span");
        assertEquals("span", element.tagName());
    }

    @Test
    public void tagNameNullInputTest() {
        new Element(Tag.valueOf(""), "").tagName(null);
    }

    @Test
    public void attrStringKeyStringValueTest() {
        Element element = new Element(Tag.valueOf("div"), "");
        element.attr("key", "value");
        assertEquals("value", element.attr("key"));
    }

    @Test
    public void attrStringKeyBooleanValueTest() {
        Element element = new Element(Tag.valueOf("div"), "");
        element.attr("key", true);
        assertTrue(element.hasAttr("key"));
    }

    @Test
    public void datasetTest() {
        Element element = new Element(Tag.valueOf("div"), "");
        element.attr("data-test", "value");
        assertEquals(Collections.singletonMap("test", "value"), element.dataset());
    }

    @Test
    public void isTest() {
        Element element = new Element(Tag.valueOf("div"), "");
        element.attr("class", "test");
        assertTrue(element.is(".test"));
        assertFalse(element.is(".another"));
    }

    @Test
    public void selectFirstTest() {
        Element parent = new Element(Tag.valueOf("div"), "");
        Element child = new Element(Tag.valueOf("span"), "");
        parent.appendChild(child);

        assertEquals(child, parent.selectFirst("span"));
        assertNull(parent.selectFirst("img"));
    }

    @Test
    public void appendChildTest() {
        Element parent = new Element(Tag.valueOf("div"), "");
        Element child = new Element(Tag.valueOf("span"), "");
        parent.appendChild(child);

        assertEquals(1, parent.children().size());
        assertEquals(child, parent.child(0));
    }

    @Test
    public void emptyTest() {
        Element parent = new Element(Tag.valueOf("div"), "");
        Element child = new Element(Tag.valueOf("span"), "");
        parent.appendChild(child);

        parent.empty();

        assertEquals(0, parent.children().size());
    }

    @Test
    public void hasClassTest() {
        Element element = new Element(Tag.valueOf("div"), "");
        element.attr("class", "test");

        assertTrue(element.hasClass("test"));
        assertFalse(element.hasClass("another"));
    }

    @Test
    public void addClassTest() {
        Element element = new Element(Tag.valueOf("div"), "");
        element.addClass("test");

        assertTrue(element.hasClass("test"));
        assertFalse(element.hasClass("another"));
    }

    @Test
    public void textTest() {
        Element element = new Element(Tag.valueOf("div"), "");
        element.text("Text test");

        assertEquals("Text test", element.text());
    }

    @Test
    public void htmlTest() {
        Element element = new Element(Tag.valueOf("div"), "http://example.com");
        element.html("<span><a href='http://example.com'>Example</a></span>");

        String expectedHtml = "<span>\n <a href=\"http://example.com\">Example</a>\n</span>";
        assertEquals(expectedHtml, element.html());
    }

    @Test
    public void cloneTest() {
        Element original = new Element(Tag.valueOf("div"), "");
        Element clone = original.clone();

        assertNotSame(original, clone);
        assertEquals(original.outerHtml(), clone.outerHtml());
    }

}